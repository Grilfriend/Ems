package com.qhit.utils;

import com.qhit.baseUser.pojo.BaseUser;
import javafx.scene.chart.PieChart;

import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author name
 * @date 2019/4/9 19:18
 */
public   class Get {


    public static    double GetSession(HttpSession session){
        BaseUser baseUser = (BaseUser) session.getAttribute("baseUser");
        return baseUser.getCompid();
    }
    public  static double GetTime(String time1, String time2){

        Date date=new Date();
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
        try {
            Date date1 = simpleDateFormat.parse(time1);
            Date date2 = simpleDateFormat.parse(time2);
            double time= date2.getTime()- date1.getTime();
            time=time/(1000*60*60*24);
            return  time;
        } catch (ParseException e) {
            e.printStackTrace();
        }
       return 0;
    }
    public static int GetElRandom(){
        Random ra =new Random();
        int i = ra.nextInt(199);
        return i+100;
    }

    public static int GetWaterRandom(){
        Random ra =new Random();
        int i = ra.nextInt(9);
        return i+1;
    }

    public static int GetOilRandom(){
        Random ra =new Random();
        int i = ra.nextInt(39);
        return i+1;
    }
}
