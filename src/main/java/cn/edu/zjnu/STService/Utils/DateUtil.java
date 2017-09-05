package cn.edu.zjnu.STService.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yly on 2017/6/29.
 */
public class DateUtil {
    /**
     * 日期转换为字符串
     * 格式为“yyyy-MM-dd HH:mm:ss”
     * @param date
     * @return
     */
    public String DateToString(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String string = simpleDateFormat.format(date);
        return string;
    }

    /**
     * 字符串转换为日期
     * 格式为“yyyy-MM-dd HH:mm:ss”
     * @param string
     * @return
     */
    public Date StringToDate(String string){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = simpleDateFormat.parse(string);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
