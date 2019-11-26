package homework.staticproxy;

import org.apache.log4j.Logger;

/**
 * @ClassName: PersonImpl
 * @description: personBean
 * @author:Anhlaidh
 * @create: 2019/11/26 0026 10:53
 */
public class PersonImpl implements IPerson {

    @Override
    public void sleep() {
        System.out.println("睡觉觉");
    }

    @Override
    public void eating() {
        System.out.println("吃饭饭");
    }
}
