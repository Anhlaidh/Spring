package homework.staticproxy;

import org.apache.log4j.Logger;

import java.util.Date;

/**
 * @ClassName: SavePerson
 * @description: enme
 * @author:Anhlaidh
 * @create: 2019/11/26 0026 10:55
 */
public class SavePerson implements IPerson {
    private IPerson person;

    public SavePerson(IPerson person) {
        this.person = person;
    }

    Logger logger = Logger.getLogger(SavePerson.class);
    @Override
    public void sleep() {
        logger.info("洗脚脚"+new Date());
        person.sleep();
        logger.info("盖被被");

    }

    @Override
    public void eating() {
        logger.info("洗手手"+new Date());
        person.eating();
        logger.info("擦嘴嘴");
    }
}
