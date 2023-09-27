package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

// Этот класс специально для security аспектов
@Component
@Aspect
@Order(2)
public class SecurityAspect {
    @Before("aop.aspects.MyPointcuts.allGetMethods()")// Здесь необходимо написать полное имя, т.к. расположены в разных классах
    public void beforeGetSecurityAdvice() {
        // здесь указывается что проверка осуществляется
        System.out.println("beforeGetSecurityAdvice: проверка прав на получение" + "книги/журнала");
    }
}
