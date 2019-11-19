package Spring.Dao;

import Spring.entity.Student;

/**
 * @ClassName StudentImpl
 * @Description TODO
 * @Author Anhlaidh
 * @DATE 2019/11/19 0019 18:21
 * @Version
 */
public class StudentDaoImpl implements IStudentDao {
    @Override
    public void addStudent(Student student) {
        System.out.println("add Student");
    }
}
