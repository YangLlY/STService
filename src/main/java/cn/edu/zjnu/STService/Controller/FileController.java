package cn.edu.zjnu.STService.Controller;

import cn.edu.zjnu.STService.Model.Firm;
import cn.edu.zjnu.STService.Model.Materialdir;
import cn.edu.zjnu.STService.Model.Project;
import cn.edu.zjnu.STService.Service.IFirmService;
import cn.edu.zjnu.STService.Service.IMaterialdirService;
import cn.edu.zjnu.STService.Service.IProjectService;
import cn.edu.zjnu.STService.Utils.DateUtil;
import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

/**
 * Created by yly on 2017/6/22.
 */
@Controller
@RequestMapping("/file")
public class FileController extends BaseController{
    @Resource
    private IFirmService firmService;
    @Resource
    private IProjectService projectService;
    @Resource
    private IMaterialdirService materialdirService;

    @RequestMapping(value = "/upload.do",method = RequestMethod.POST)
    @ResponseBody
    public void FileUpload(@RequestParam("file")CommonsMultipartFile file, HttpServletRequest request, HttpServletResponse response){
        //项目id、该项目所属的企业id
        Integer proid = Integer.valueOf(request.getParameter("proid"));
        Integer firmid = Integer.valueOf(request.getParameter("firmid"));
        //获得该项目信息
        Project project = projectService.findOneById(proid);
        String projectName = project.getProname();
        Integer materialdirid = project.getMaterialdirid();

        //获得该企业信息
        Firm firm = firmService.findOneById(firmid);
        String firmName = firm.getName();
        //获得原始文件名
        String fileName = file.getOriginalFilename();
        System.out.println("========上传文件原名："+fileName);

        //给原始文件名后添加后缀"_count"
        String fName = "";//文件前缀名
        String suffix = "";//文件后缀类型
        if(fileName.indexOf(".")>=0) {

            int indexdot = fileName.indexOf(".");
            suffix = fileName.substring(indexdot);

            fName = fileName.substring(0, fileName.lastIndexOf("."));
            //获取同种文件上传的次数
            Integer count = materialdirService.count(fName, materialdirid);
            fName = fName + "_" + count;
            //获得最终的文件名
            fName = fName + suffix;
        }
            //获得项目的路径
        ServletContext servletContext = request.getSession().getServletContext();

        //上传的位置,设定文件保存的目录
        /*测试文件位置：STService/target/STService/upload/*/
        String path = servletContext.getRealPath("/upload/"+firmName+"/"+projectName);
        //创建文件目录
        File f = new File(path);
        // 如果目录不存在就创建
        if (!f.exists()){
            f.mkdirs();
        }
        if (!file.isEmpty()){
            try{
                FileOutputStream fos = new FileOutputStream(path+"/"+fName);
                InputStream in = file.getInputStream();
                int b = 0;
                while ((b = in.read())!= -1){
                    fos.write(b);
                }
                fos.close();
                in.close();
                Materialdir materialdir = new Materialdir();
                materialdir.setMaterialdirid(materialdirid);
                materialdir.setMaterialname(fName);
                materialdir.setMaterialurl(path);
                materialdir.setUploadtime(new DateUtil().DateFormater());
                materialdirService.add(materialdir);
                System.out.println("=========上传文件成功======");
                this.write(response,true);
            }catch (Exception e) {
                this.write(response,false);
                System.out.println("=========上传文件失败=====");
                e.printStackTrace();
            }
        }
    }

    @RequestMapping(value = "/down.do",method = RequestMethod.POST,produces = "application/octet-stream;charset=UTF-8")
    @ResponseBody
    public  ResponseEntity<byte[]> FileDown(HttpServletRequest request) throws IOException{
        //项目id、所需下载的文件名称
        Integer proid = Integer.valueOf(request.getParameter("proid"));
        String fileName = request.getParameter("materialname");

        //获得材料目录id
        Integer materialdirid = projectService.findOneById(proid).getMaterialdirid();
        //获得此材料的保存前路径
        String path = materialdirService.findOneBydirIdAndName(fileName,materialdirid).getMaterialurl();
        //全路径 = 前路径+文件名
        File file = new File(path+"\\"+fileName);
        //设置下载浏览器响应的文件名
        String dfileName = fileName;
        //转码，以免中文名乱码、丢失
        //header中只支持ASCII，所以传输的文件名必须是ASCII，当文件名为中文时，必须要将该中文转换成ASCII
        dfileName = URLEncoder.encode(dfileName,"UTF-8");
        //设置HttpHeaders，使得浏览器响应下载
        HttpHeaders headers = new HttpHeaders();
        //设置响应方式
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        //设置响应文件
        headers.setContentDispositionFormData("attachment",dfileName);
        //把文件以二进制形式写回
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.CREATED);

    }

}
