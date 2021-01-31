package com.ldp;

import com.ldp.pojo.HttpClientResult;
import com.ldp.util.HttpClientUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            HttpClientResult httpClientResult = HttpClientUtils.doGet("https://uri.amap.com/marker?position=116.473195,39.993253");
            System.out.println(httpClientResult.getContent());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
