package cn.edu.zjnu.STService.Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yly on 2017/6/29.
 */
public class DateUtil {

    public String DateFormater(){
        SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();
    return dateFormater.format(date);
    }
}
