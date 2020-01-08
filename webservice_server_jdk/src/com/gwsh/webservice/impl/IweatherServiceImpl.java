package com.gwsh.webservice.impl;

import com.gwsh.webservice.IWeatherService;

import javax.jws.WebService;

/**
 * @program webservice_server_jdk
 * @description: 天气接口的实现
 * @author: gwsh
 * @create: 2020/01/08 19:28
 */
@WebService
public class IweatherServiceImpl implements IWeatherService {
    final static String W_0001 = "大晴天";
    final static String W_0002 = "下雨天";

    /**
     * 模拟天气数据的实现
     *
     * @param cityName 需要查询天气的城市名
     * @return
     */
    @Override
    public String query(String cityName) {
        System.err.println(cityName + "城市的天气查询中————————————star");
        String result = cityName + "天气情况是" + IweatherServiceImpl.W_0001;
        System.err.println(cityName + "城市的天气查询中————————————end");
        return result;
    }
}
