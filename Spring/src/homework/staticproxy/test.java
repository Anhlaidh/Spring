package homework.staticproxy;

/**
 * @ClassName: test
 * @description: main
 * @author:Anhlaidh
 * @create: 2019/11/26 0026 11:01
 */
public class test {
    public static void main(String[] args) {
        IPerson proxy = new SavePerson(new PersonImpl());
        proxy.eating();
        proxy.sleep();
    }
}
