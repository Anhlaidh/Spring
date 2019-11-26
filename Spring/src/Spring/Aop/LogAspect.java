package Spring.Aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @ClassName: LogAspect
 * @description: aop annotation method
 * @author:Anhlaidh
 * @create: 2019/11/25 0025 15:34
 */
@Aspect
public class LogAspect  {
    @Pointcut ("execution(* save*(..))")
    public void allSaveMethod(){}

    @Before("allSaveMethod()")
    public void log()
    {
        System.out.println("------------write log into logfile-----  ---------");
    }
}
