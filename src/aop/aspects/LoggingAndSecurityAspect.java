package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
// Ещё проверяем, есть ли право у человека, взять книгу или журнал, т.е. например записан ли человек в библиотеке или нет
@Component
@Aspect
public class LoggingAndSecurityAspect {
    // Объявление Pointcut
    @Pointcut("execution(* get*())")
    private void allGetMethods() {

    }

    //  метод, который вызовется до getBook
     @Before("allGetMethods()")// здесь пишем метод, объявленный в Pointcut, т.е. делаем ссылку на этот Pointcut

    public void beforeGetLoggingAdvice() {
        // здесь указывается что должно произойти до вызова метода getBook()
        System.out.println("beforeGetBookAdvice: попытка получить книгу или журнал");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice() {
        // здесь указывается что проверка осуществляется
        System.out.println("beforeGetSecurityAdvice: проверка прав на получение" + "книги/журнала");
    }

}
