package com.songyang.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * 小工具类
 * @author Yang Song
 * @date 2022/9/24 13:32
 */
public class MyUtil {
    /**
     * urlEncoder
     * @param s 待urlEncoder字符串
     * @return urlEncoder后字符串
     */
    public static String urlEncoder(String s){
        try {
            s = URLEncoder.encode(s,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return s;
    }

    /**
     * urlDecoder
     * @param s 待urlDecoder字符串
     * @return urlDecoder后字符串
     */
    public static String urlDecoder(String s){
        try {
            s = URLDecoder.decode(s,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return  s;
    }
}
