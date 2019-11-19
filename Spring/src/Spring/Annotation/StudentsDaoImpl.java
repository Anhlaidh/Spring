package Spring.Annotation;

import Spring.entity.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @ClassName StudentsDaoImpl
 * @Description TODO
 * @Author Anhlaidh
 * @DATE 2019/11/19 0019 11:55
 * @Version
 */
//@Component("Student")细化为三个：dao层注解为Repository，service层注解为Service，控制器层注解为Contorller
    @Repository()
public class StudentsDaoImpl {
    public void addStudent(Student student){
        System.out.println("add Student");
    }
}
