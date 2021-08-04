package com.recruit.get_time_;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class G_Time {

    @Test
    public void t1(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String s = df.format(new Date());
        System.out.println(s);// new Date()为获取当前系统时间
    }

    public static String getTime(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
//        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
        String s = df.format(new Date());
        return s;
    }

    @Test
    public void test(){
        SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
        String time = "1999-6-4";
        String date= sp.format(time);
        System.out.println(date);


    }

}
