package Spring.Aop;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;

/**
 * @ClassName: LogAspectXML
 * @description: aop&XML
 * @author:Anhlaidh
 * @create: 2019/11/25 0025 15:48
 */
public class LogAspectXML {
    private Logger logger = Logger.getLogger(LogAspectXML.class);
    public void log(){
        logger.info("山东");
        logger.info("菏泽");
        logger.info("曹县");
        logger.info("牛逼");
        logger.info("666");
        logger.info("我滴");
        logger.info("包贝尔");
    }

}
