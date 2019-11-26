package Spring.Aop;

/**
 * @ClassName: StudentImpl
 * @description: Aoptest
 * @author:Anhlaidh
 * @create: 2019/11/25 0025 16:17
 */

public class StudentImpl implements IStudent {
    @Override
    public void saveStudy() {
        System.out.println("study!!");
    }

    @Override
    public void saveSleep() {
        System.out.println("sleep!!");

    }

    @Override
    public void eat() {
        System.out.println("eat!!");

    }
}
