package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {// Здесь добавляется в параметры связь с target методом
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку пытаются вернуть книгу");

        // засечём время работы
        long begin = System.currentTimeMillis();

        Object targetMethodResult = proceedingJoinPoint.proceed();// результат возврата данного метода Object
        // можно поменять результат выполнения метода
        targetMethodResult = "Два дня таланта Леонида Зулина";
        long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку успешно вернули книгу");
        System.out.println("aroundReturnBookLoggingAdvice: метод returnBook выполнил работы за = " + (end - begin) + " миллисекунд");

        return targetMethodResult;

    }
}
