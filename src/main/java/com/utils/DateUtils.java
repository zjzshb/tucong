package com.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by John on 2019/5/6.
 */
public class DateUtils {
    public static String getNowDate(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String createdate = sdf.format(date);
        return createdate;
    }
}
