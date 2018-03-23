package SpringAdvisor;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/3/12.
 */
public class BeforeAdvice implements MethodBeforeAdvice{

    public void before(Method method, Object[] objects, Object o) throws Throwable {

    }
}