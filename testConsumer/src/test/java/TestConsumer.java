import ecmoho.service.DemoServcie;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by meidejing on 2017/3/6.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:spring-consumer.xml"})
//@SuppressWarnings(value = "all")
public class TestConsumer {
//    @Autowired
//    private  DemoServcie demoServcie;
    @Test
    public void test(){
//        System.out.println(demoServcie.getUsers());
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"classpath:spring-consumer.xml"});
        DemoServcie demoService = (DemoServcie) context.getBean("demoService");
        System.out.println(demoService.getUsers());
    }
}
