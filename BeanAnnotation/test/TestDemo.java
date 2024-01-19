import com.alibaba.druid.pool.DruidDataSource;
import com.sun.qing.service.UserService;
import com.sun.qing.service.dao.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    @Test
    void demo01_userService() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean01.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.annotationUse();
    }
//    org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'userService' available
    @Test
    void demo02_userController() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean01.xml");
        UserController userController = context.getBean("userController", UserController.class);
        userController.add();
    }
//    UserController add ...
}
