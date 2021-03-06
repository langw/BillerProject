package com.huami.watch.billerproject.utils;

import android.util.Log;


/**
 * Log 输出工具类
 */
public class LogUtils {

    private static final String  SEPARATION = "-------";
    private static final String TAG = LogUtils.class.getSimpleName();
    private static final boolean IS_DEBUG = true ;
    public static void print(String tag ,String method ,String data){
        if(IS_DEBUG){
            Log.i(TAG, new StringBuilder(tag).append(SEPARATION)
                    .append(method).append(SEPARATION)
                    .append(data).append(SEPARATION)
                    .toString());
        }
    }

    public static void print(String tag, String method ){
        if(IS_DEBUG){
            Log.i(TAG, new StringBuilder(tag).append(SEPARATION)
                    .append(method).append(SEPARATION)
                    .toString());
        }

    }

    public static void sysPrint(String tag ,String data){

        System.out.println(new StringBuilder("["+tag+"]---------").append(data)) ;
    }


}
