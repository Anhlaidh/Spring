package Spring.Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: test
 * @description: test
 * @author:Anhlaidh
 * @create: 2019/11/25 0025 16:19
 */
public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("HomeWorkContext.xml");
        IStudent student = (IStudent) context.getBean("student");

        student.saveSleep();
    }
}
