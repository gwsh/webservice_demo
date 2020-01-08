package com.gwsh.webservice;

/**
 * @program webservice_server_jdk
 * @description: 天气服务的接口
 * @author: gwsh
 * @create: 2020/01/08 19:25
 */
public interface IWeatherService {
    /**
     * 查询天气接口
     * @param cityName 需要查询天气的城市名
     * @return 返回String 类型的描述
     */
    public String query(String cityName);
}
