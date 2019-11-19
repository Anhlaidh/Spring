package Spring.entity;

/**
 * @ClassName Student
 * @Description TODO
 * @Author Anhlaidh
 * @DATE 2019/11/18 0018 17:55
 * @Version
 */
public class Student {
    private int stuNo;
    private int stuAge;
    private String stuName;

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
}
