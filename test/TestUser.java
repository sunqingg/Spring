import com.alibaba.druid.pool.DruidDataSource;
import com.sun.qing.service.*;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    void testDemo1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("base.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    void testDemo2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("base.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }

    @Test
    void testDemo3() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("base.xml");
        Order order = context.getBean("order", Order.class);
        System.out.println(order);
    }

    @Test
    void testBook() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("base.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }

    @Test
    void testDemo4() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("base.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    void testDemo5() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("base.xml");
        Dept dept = context.getBean("dept",Dept.class);
        System.out.println(dept);
    }

    @Test
    void testDemo6() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("base1.xml");
        Stu dept = context.getBean("stu",Stu.class);
        System.out.println(dept);
    }

    @Test
    void testDemo7() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("base2.xml");
        User user1 = context.getBean("user", User.class);
        User user2 = context.getBean("user", User.class);
        System.out.println(user1);
        System.out.println(user2);
    }
//    com.sun.qing.service.User@26d9b808
//    com.sun.qing.service.User@26d9b808

    @Test
    void testDemo8() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("base2.xml");
        User user1 = context.getBean("user", User.class);
        System.out.println("第四步： 提供使用");
        System.out.println(user1);
        context.close();
    }

    @Test
    void testDemo9() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("base2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
    @Test
    void testDemo10() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("base3.xml");
        DruidDataSource dataSource = context.getBean("druidAbstractDataSource", DruidDataSource.class);
        System.out.println(dataSource);
        System.out.println(dataSource.getDriver());
    }
}
