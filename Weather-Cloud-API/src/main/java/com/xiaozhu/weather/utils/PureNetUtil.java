package com.xiaozhu.weather.utils;

import com.alibaba.fastjson.JSON;
import com.xiaozhu.weather.po.City;
import com.xiaozhu.weather.po.Province;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * 网络访问工具类
 */
public class PureNetUtil {

    public static List<Province> getProvince() throws IOException {
        return JSON.parseArray(ProvinceOrCityUtils(null), Province.class);
    }

    public static List<City> getCity(String cityUrl) throws IOException {
        return JSON.parseArray(ProvinceOrCityUtils(cityUrl), City.class);
    }

    public static String getWearter(String cityId) throws IOException {
        return WeatherUtils(cityId);
    }

    public static String ProvinceOrCityUtils(String cityUrl) throws IOException {
        // 我们需要进行请求的地址：
        String temp = "";
        if (cityUrl == null) {
            temp = "http://www.nmc.cn/f/rest/province/";
        } else {
            temp = "http://www.nmc.cn/f/rest/province/" + cityUrl;
        }
        StringBuilder stringBuilder = new StringBuilder();
        try {
            // 1.URL类封装了大量复杂的实现细节，这里将一个字符串构造成一个URL对象
            URL url = new URL(temp);
            // 2.获取HttpURRLConnection对象
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            //设置连接主机超时（单位：毫秒）
            connection.setConnectTimeout(30000);
            //设置从主机读取数据超时（单位：毫秒）
            connection.setReadTimeout(30000);
            // 3.调用connect方法连接远程资源
            connection.connect();
            // 4.访问资源数据，使用getInputStream方法获取一个输入流用以读取信息
            BufferedReader bReader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream(), "UTF-8"));
            // 对数据进行访问
            String line = null;
            while ((line = bReader.readLine()) != null) {
                stringBuilder.append(line);
            }
            // 关闭流
            bReader.close();
            // 关闭链接
            connection.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        // 打印获取的结果
        return stringBuilder.toString();
    }

    public static String WeatherUtils(String cityId) throws IOException {
        // 我们需要进行请求的地址：
        String temp = "http://www.nmc.cn/f/rest/real/" + cityId;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            // 1.URL类封装了大量复杂的实现细节，这里将一个字符串构造成一个URL对象
            URL url = new URL(temp);
            // 2.获取HttpURRLConnection对象
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            //设置连接主机超时（单位：毫秒）
            connection.setConnectTimeout(30000);
            //设置从主机读取数据超时（单位：毫秒）
            connection.setReadTimeout(30000);
            // 3.调用connect方法连接远程资源
            connection.connect();
            // 4.访问资源数据，使用getInputStream方法获取一个输入流用以读取信息
            BufferedReader bReader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream(), "UTF-8"));
            // 对数据进行访问
            String line = null;
            while ((line = bReader.readLine()) != null) {
                stringBuilder.append(line);
            }
            // 关闭流
            bReader.close();
            // 关闭链接
            connection.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        // 打印获取的结果
        String s = stringBuilder.toString();
        System.out.println(s);
        return s;
    }
}
