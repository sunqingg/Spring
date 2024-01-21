import com.sun.qing.config.TxConfig;
import com.sun.qing.pojo.Book;
import com.sun.qing.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


public class TestJdbc {
//    @Autowired
//    BookService bookService;
    @Test
    public void Demo1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book(2 ,"九阳神功", "qq");
        bookService.add(book);
    }
    @Test
    public void Demo2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book(2 ,"九阳神功", "ww");
        bookService.update(book);
    }

    @Test
    public void Demo3() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);

        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.accountMoney();
    }
}
