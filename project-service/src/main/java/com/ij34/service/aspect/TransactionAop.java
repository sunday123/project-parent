package com.ij34.service.aspect;

import com.ij34.model.ClassifyInfo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class TransactionAop {

    @Pointcut("execution(* com.ij34.service.*Service.insert*(..))")
    public void pointcut( ) {
        System.out.println(" pointcut():");
    }

    @Before(value = "pointcut()")
    public void beginTransaction(JoinPoint joinPoint) throws Exception {
        System.out.println("before beginTransaction()"+ Arrays.toString(joinPoint.getArgs()));
        if ( joinPoint.getArgs()[0] instanceof ClassifyInfo){
            System.out.println("----------------是classify");
            ClassifyInfo c= (ClassifyInfo) joinPoint.getArgs()[0];
            if (c.getId()==null){
                throw new RuntimeException ("ID空");
            }
        }
    }

    @After("pointcut()")
    public void commit() {
        System.out.println("after commit");
    }

    @AfterReturning(value = "pointcut()", returning = "obj")
    public void afterReturning(Object obj) {
        System.out.println("afterReturning:" + obj);
    }

    @AfterThrowing("pointcut()")
    public void afterThrowing() {
        System.out.println("afterThrowing afterThrowing:rollback");
    }

/*    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            System.out.println("around1"+Arrays.toString(joinPoint.getArgs()));
            return joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
            throw e;
        } finally {
            System.out.println("around2");
        }
    }*/
}


