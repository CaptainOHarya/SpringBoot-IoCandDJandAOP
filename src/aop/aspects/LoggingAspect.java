package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    //  метод, который вызовется до getBook
    // @Before("execution(public void getBook())")
    // @Before("execution(public void aop.UniLibrary.getBook())") // можно написать и  полное имя класса
   // @Before("execution(public void getBook(String))") // можно использовать шаблон с параметрами, просто указав тип, без саой переменной
   // @Before("execution(public void get*(*))") // можно использовать Wild card (* - шаблон)
    @Before("execution(public void get*(..))") // можно использовать переменное число параметров с помощью ..
    public void beforeGetBookAdvice() {
        // здесь указывается что должно произойти до вызова метода getBook()
        System.out.println("beforeGetBookAdvice: попытка получить книгу");
    }

   /* @Before("execution(* returnBook())")// в данном случае * означает любой тип и любой acsess modifier
    public void beforeReturnBookAdvice() {
        // здесь указывается что должно произойти до вызова метода getBook()
        System.out.println("beforeGetBookAdvice: попытка вернуть книгу");
    }*/
}
