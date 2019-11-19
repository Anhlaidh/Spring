package Spring.Service;

import Spring.Dao.IStudentDao;
import Spring.entity.Student;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

/**
 * @ClassName StudentServiceImpl
 * @Description TODO
 * @Author Anhlaidh
 * @DATE 2019/11/19 0019 18:23
 * @Version
 */
public class StudentServiceImpl implements IStudentService {

    IStudentDao studentDao;

    public IStudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(IStudentDao studentDao) {
        this.studentDao = studentDao;
    }
    @Transactional(readOnly = false,propagation = Propagation.REQUIRED,
    rollbackFor = {SQLException.class,ArithmeticException.class})

    @Override

    public void addStudent(Student student) {

    }
}
