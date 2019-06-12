package com.jason.wy.demoservice.aspect;

import com.jason.wy.democommon.annotation.TestAnnotation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author wangyuan02
 * @desc
 * @date 2019-06-11 17:20
 */

@Aspect
@Component
public class TestAspect {


    /**
     * 定义在service包里的任意方法的执行：
     * <p>
     * execution(* com.xyz.service.*.*(..))
     * <p>
     * 定义在service包和所有子包里的任意类的任意方法的执行：
     * <p>
     * execution(* com.xyz.service..*.*(..))
     */
    @Pointcut("@annotation(com.jason.wy.democommon.annotation.TestAnnotation) &&" +

            "execution(* com.jason.wy..*.*(..))") // 注解声明切点
    public void annotationPointcut() {
    }

    ;

    @After("annotationPointcut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        TestAnnotation annotation = method.getAnnotation(TestAnnotation.class);
        System.out.println("注解式拦截 : " + annotation.name());

    }


}