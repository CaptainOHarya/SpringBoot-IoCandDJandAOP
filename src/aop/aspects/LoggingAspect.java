package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    //  метод, который вызовется до getBook
    @Before("execution(public void getBook())")
    public void beforeGetBookAdvice() {
        // здесь указывается что должно произойти до вызова метода getBook()
        System.out.println("beforeGetBookAdvice: попытка получить книгу");
    }

}
