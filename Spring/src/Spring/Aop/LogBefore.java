package Spring.Aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @ClassName LogBefore
 * @Description TODO
 * @Author Anhlaidh
 * @DATE 2019/11/19 0019 19:27
 * @Version
 */
public class LogBefore implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置通知");
    }
}
