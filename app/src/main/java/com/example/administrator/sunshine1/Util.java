package com.example.administrator.sunshine1;

import android.util.Log;

/**
 * Created by 영도 on 2015-07-25.
 */

//
public class Util {
    private static Util m_instance;
    private static final Boolean DEBUGMODE = true;
    private static Boolean DEBUG = true;
    private static String TAG = "Util";
    private Util(){
        printLog(DEBUG, TAG, "[Util]");

    }

    public static Util getInstance(){
        if(m_instance ==null){
            m_instance = new Util();
        }
        return m_instance;
    }
    public void printLog(boolean bPrint, String tag, String msg){
        if(DEBUGMODE){
            if(bPrint){
                Log.d(tag, msg);
            }
        }
    }
}
