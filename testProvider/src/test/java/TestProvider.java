import com.sun.javafx.collections.annotations.ReturnsUnmodifiableCollection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

/**
 * Created by meidejing on 2017/3/6.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:spring-provider.xml"})
public class TestProvider {
    @Test
    public void test() throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"classpath:spring-provider.xml"});
        context.start();
        System.in.read();
    }
}
