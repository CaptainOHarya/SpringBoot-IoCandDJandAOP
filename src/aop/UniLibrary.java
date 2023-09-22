package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    // здесь рассмотрим метод, принимающий параметры
    public void getBook() {
        System.out.println("Мы берём книгу из библиотеки Университета: ");


    }

    public void returnBook() {
        System.out.println("Мы возвращаем книгу в библиотеку Университета");

    }


    public void getMagazine() {
        System.out.println("Мы берём журнал из библиотеки Университета");
    }


    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в библиотеку Университета");

    }

    public void addBook() {
        System.out.println("Мы добавляем книгу в библиотеку Университета");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в библиотеку Университета");
    }
}