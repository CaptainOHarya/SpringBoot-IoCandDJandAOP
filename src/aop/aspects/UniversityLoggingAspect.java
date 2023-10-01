package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

/*    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов перед методом getStudents");

    }*/

    /*@AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {

        // получим имя например 1-ого студента и изменим его
        Student firstStudent = students.get(0);
        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Великий " + nameSurname;
        firstStudent.setNameSurname(nameSurname);

        // получим средний бал 2-ого студента и изменим его
        Student secondStudent = students.get(1);
       double avgGrade = secondStudent.getAvgGrade();
       avgGrade = 0.2 + avgGrade;
       secondStudent.setAvgGrade(avgGrade);



        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение списка студентов после работы метода getStudents");

    }*/

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем выброс исключения " + exception);

    }





}
