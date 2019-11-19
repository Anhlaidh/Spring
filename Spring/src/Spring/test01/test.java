package Spring.test01;

import Spring.entity.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName test
 * @Description TODO
 * @Author Anhlaidh
 * @DATE 2019/11/18 0018 18:23
 * @Version
 */
public class test {
    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Chinese chinese = (Chinese) classPathXmlApplicationContext.getBean("chinese");
        chinese.useAxe();
        System.out.println(chinese);
        Teacher teacher = (Teacher) classPathXmlApplicationContext.getBean("teacher");
        System.out.println(teacher);


    }
}
