package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    // здесь рассмотрим метод, принимающий параметры
    public void getBook() {
        System.out.println("Мы берём книгу из библиотеки Университета: ");
        System.out.println("____________________________________________________________");


    }

    public String returnBook() {
        int a = 10/0;
        System.out.println("Мы возвращаем книгу в библиотеку Университета");
        return "Один день таланта Леонида Зулина";

    }


    public void getMagazine() {
        System.out.println("Мы берём журнал из библиотеки Университета");
        System.out.println("____________________________________________________________");
    }


    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в библиотеку Университета");
        System.out.println("____________________________________________________________");

    }

    public void addBook(String person_name, Book book) {// Здесь параметры: имя человека, который добавляет книгу и какую книгу
        System.out.println("Мы добавляем книгу в библиотеку Университета");
        System.out.println("____________________________________________________________");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в библиотеку Университета");
        System.out.println("____________________________________________________________");
    }
}