package Spring.test03;

import Spring.test01.Chinese;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName test
 * @Description TODO
 * @Author Anhlaidh
 * @DATE 2019/11/19 0019 11:15
 * @Version
 */
public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        System.out.println(context.getBean("collection"));
        Chinese chinese2 = (Chinese)context.getBean("chinese2");
        chinese2.useAxe();
    }
}
