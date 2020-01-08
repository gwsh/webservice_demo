import com.gwsh.webservice.impl.IweatherServiceImpl;
import com.gwsh.webservice.impl.IweatherServiceImplService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @program web
 * @description: 客服端调用服务端的WebService API
 * @author: gwsh
 * @create: 2020/01/08 21:35
 */
public class ClientMain {
    final static String CS = "长沙";
    final static String SH = "上海";

    public static void main(String[] args) {
        // 写法1
        mode1(ClientMain.CS);
        // 写法2
        mode2(ClientMain.SH);
    }

    private static void mode1(String city) {
        // 1.创建服务视图（视图是从wsdl xml文档中的 service标签的name属性获取来的）
        IweatherServiceImplService iweatherServiceImplService = new IweatherServiceImplService();
        // 2.获取服务实现类（实现类是从wsdl xml文档中的 portType标签的name属性获取来的)
        IweatherServiceImpl iweatherService = iweatherServiceImplService.getPort(IweatherServiceImpl.class);
        // 3.调用服务（从wsdl xml文档中的 portType标签下面的 operation标签获取的）
        String result = iweatherService.query(city);
        // 4.业务处理
        System.out.println(city + "：" + result);
    }

    private static void mode2(String city) {
        try {
            QName qName = new QName("http://impl.webservice.gwsh.com/", "IweatherServiceImplService");
            URL url = new URL("http://127.0.0.1:8080/weatherService?wsdl");
            Service service = Service.create(url, qName);
            IweatherServiceImpl iweatherService =service.getPort(IweatherServiceImpl.class);
            String result = iweatherService.query(city);
            System.out.println(city + "：" + result);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
