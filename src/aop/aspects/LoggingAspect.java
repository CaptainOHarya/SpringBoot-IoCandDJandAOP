package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
// Ещё проверяем, есть ли право у человека, взять книгу или журнал, т.е. например записан ли человек в библиотеке или нет
@Component
@Aspect
@Order(1)// можно использовать цифры 10, 20 и т.д., чтобы можно было добавлять ещё аспекты с приоритетом между ними, например 15
public class LoggingAspect {

    // Pointcut, который подходит всем методам UniLibrary
 /*   @Pointcut("execution(* aop.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary() {

    }

    // Pointcut, который подходит методу returnMagazine()
    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary() {

    }

    // Комбинированный Pointcut
    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary(){

    }

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice() {
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #55");
    }
*/










    /*// Объявление Pointcut для get методов
    @Pointcut("execution(* aop.UniLibrary.get*())")
    private void allGetMethodsFromUniLibrary() {

    }

    // Объявление Pointcut для return методов
    @Pointcut("execution(* aop.UniLibrary.return*())")
    private void allReturnMethodsFromUniLibrary() {

    }

    // А теперь создаём Pointcut, который является комбинацией 1ого и 2ого Pointcuts
    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
    private void allGetAndReturnMethodsFromUniLibrary() {

    }

    @Before("allGetMethodsFromUniLibrary()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: writing Log #1");
    }



    @Before("allReturnMethodsFromUniLibrary()")
    public void beforeReturnLoggingAdvice(){
        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
    }

    @Before("allGetAndReturnMethodsFromUniLibrary()")
    public void beforeGeAndReturnLoggingAdvice() {
        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
    }*/


    //  метод, который вызовется до getBook
     @Before("aop.aspects.MyPointcuts.allGetMethods()")// здесь пишем метод, объявленный в Pointcut, т.е. делаем ссылку на этот Pointcut
    public void beforeGetLoggingAdvice() {
        // здесь указывается что должно произойти до вызова метода getBook()
        System.out.println("beforeGetLoggingAdvice: логирование попытки получить книгу или журнал");
    }



}
