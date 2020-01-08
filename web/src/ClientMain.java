import com.gwsh.webservice.impl.IweatherServiceImpl;
import com.gwsh.webservice.impl.IweatherServiceImplService;

/**
 * @program web
 * @description: 客服端调用服务端的WebService API
 * @author: gwsh
 * @create: 2020/01/08 21:35
 */
public class ClientMain {
    final static String CS = "长沙";
    public static void main(String[] args) {
        // 1.创建服务视图（视图是从wsdl xml文档中的 service标签的name属性获取来的）
        IweatherServiceImplService iweatherServiceImplService = new IweatherServiceImplService();
        // 2.获取服务实现类（实现类是从wsdl xml文档中的 portType标签的name属性获取来的)
        IweatherServiceImpl iweatherService =  iweatherServiceImplService.getPort(IweatherServiceImpl.class);
        // 3.调用服务（从wsdl xml文档中的 portType标签下面的 operation标签获取的）
        String result = iweatherService.query(ClientMain.CS);
        // 4.业务处理
        System.out.println(ClientMain.CS+"："+result);
    }
}
