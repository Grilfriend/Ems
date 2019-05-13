package com.qhit.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/3/28 0028.
 */
@RestController
public class HelloWorld {

    @RequestMapping(value = "/hello")
    String hello(){
        return "HelloWorld";
    }

    public static void main(String[] args) {
        Integer[] a={2,1,3,4,null,4,4,2,3,3,2,3,1};
        start3(a);
    }

    private static void start3(Integer[] a) {
        for (int i = 1; i <a.length ; i++) {
            if (a[i]==null){
                continue;
            }else {
                for (int j = 0; j <i; j++) {
                    if (a[j] == null) {
                        continue;
                    }
                   else if (a[i] < a[j]) {
                        int tem = a[i];
                        a[i] = a[j];
                        a[j] = tem;
                    }
                    else {
                        break;
                    }

                }
            }
        }
        System.out.println(Arrays.toString(a));
    }


    private static void start2(Integer[] a) {
        int tem,mian;
        for (int i = 0; i <a.length-1 ; i++) {
          mian=i;
            if (a[mian]==null){
               continue;
            }else {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j]==null){
                        continue;
                    }
                   else if(a[j] < a[mian]){
                        mian = j;
                    }
                }
            }
           tem=a[i];
            a[i]=a[mian];
            a[mian]=tem;

        }
        System.out.println(Arrays.toString(a));
    }

    private static void start4(int[] a) {
        int tem,mian;
        for (int i = 0; i <a.length-1 ; i++) {
            mian=i;
                for (int j = i + 1; j < a.length; j++) {
                     if(a[j] < a[mian]){
                        mian = j;
                    }
            }
            tem=a[i];
            a[i]=a[mian];
            a[mian]=tem;

        }
        System.out.println(Arrays.toString(a));
    }

    private static void start(int[] a) {
        Map mao=new HashMap();
        for (int i = 0; i < a.length; i++) {
            int count=0;
            for (int j = 0; j <a.length ; j++) {
                if (a[i]==a[j]){
                    count++;
                }
            }
            if (count%2!=0){
                mao.put(a[i],a[i]);
            }
        }
        for (Object s:mao.keySet()) {
            System.out.println(mao.get(s));
        }
    }





}
