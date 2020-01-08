import com.gwsh.webservice.impl.IweatherServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * @program webservice_server_jdk
 * @description: 用于发布WebService服务
 * @author: gwsh
 * @create: 2020/01/08 19:33
 */
public class main {
    /**
     * 采用JDK的方式发布WebService服务
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            Endpoint.publish("http://127.0.0.1:8080/weatherService", new IweatherServiceImpl());
            System.out.println("WebService:发布成功!");
        } catch (Exception e) {
            System.err.println("发布失败：" + e.toString());
        }
    }
}
