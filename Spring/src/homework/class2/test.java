package homework.class2;

import homework.Bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: test
 * @description: main
 * @author:Anhlaidh
 * @create: 2019/11/20 0020 10:54
 */
public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("HomeWorkContext.xml");
        Person person = (Person) context.getBean("person");
        person.feed(person.getCat());
        person.feed(person.getDog());

    }
}
