package Spring.entity;

/**
 * @ClassName Teacher
 * @Description TODO
 * @Author Anhlaidh
 * @DATE 2019/11/18 0018 19:40
 * @Version
 */
public class Teacher {
    private String course;
    private int courseTime;

    public Teacher(String course, int courseTime) {
        this.course = course;
        this.courseTime = courseTime;
    }

    public Teacher() {

    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(int courseTime) {
        this.courseTime = courseTime;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "course='" + course + '\'' +
                ", courseTime=" + courseTime +
                '}';
    }
}
