package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student student1 = new Student("Леонид Зулин", 5, 9.9);
        Student student2 = new Student("Марина Тундра", 4, 7.9);
        Student student3 = new Student("Виталий Куролесов", 2, 7.4);

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents(){
        System.out.println("Начало работы метода getStudents");
        System.out.println(students.get(3)); // такого студента у нас нет, поэтому выбросится исключение

        System.out.println("Информация о студентах:");
        System.out.println(students);

        return students;
    }

}

