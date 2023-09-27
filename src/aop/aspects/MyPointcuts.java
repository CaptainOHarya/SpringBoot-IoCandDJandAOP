package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;
// Этот класс специально для объявления Pointcut
public class MyPointcuts {


    // Объявление Pointcut
    @Pointcut("execution(* get*())")
    public void allGetMethods() { // public , т.к. он должен быть виден в других классах

    }
}
