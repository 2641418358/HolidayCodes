package cn.itcast.web.utils;


import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


public class DownLoadUtils {



    public static String getFileName(String agent, String filename) throws UnsupportedEncodingException {
        if (agent.contains("MSIE")) {
            // IE浏览器
            filename = URLEncoder.encode(filename, "utf-8");
            filename = filename.replace("+", " ");
        } else if (agent.contains("Firefox")) {
            // 火狐浏览器
           /* BASE64Encoder base64Encoder = new BASE64Encoder();
            filename = "=?utf-8?B?" + base64Encoder.encode(filename.getBytes("utf-8")) + "?=";*/
            Base64 base64 = new Base64();

            filename = "=?utf-8?B?" + base64.encode(filename.getBytes("utf-8")) + "?=";

        } else {
            // 其它浏览器
            filename = URLEncoder.encode(filename, "utf-8");
        }
        return filename;
    }

    /*public static String decode(String fileName) throws UnsupportedEncodingException {

        Base64 base64 = new Base64();

        return  new String(base64.decode(fileName.getBytes("utf-8")));
    }*/

    /*public static String code(String password) throws UnsupportedEncodingException {

        Base64 base64 = new Base64();

        byte[] encode = base64.encode(password.getBytes("utf-8"));

        return new String(encode);

    }


    public static void main(String[] args) throws UnsupportedEncodingException {
        //String agent = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.25 Safari/537.36 Core/1.70.3704.400 QQBrowser/10.4.3587.400";

        *//*String agent = "Firefox";

        String filename = getFileName(agent,"九尾.jpg");

        System.out.println(filename);

        filename = decode(filename);

        System.out.println(filename);

        System.out.println("你好");*//*

        String password = "你好";

        String code = code(password);

        System.out.println(code);

        String decode = decode(code);

        System.out.println(decode);
    }*/
}
