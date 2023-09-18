package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    // здесь рассмотрим метод, принимающий параметры
    public void getBook(Book book) {
        System.out.println("Мы берём книгу из библиотеки Университета: " + book.getName());
        System.out.println("Мы берём книгу из библиотеки Университета: 2" + book.getName());

    }

  /* protected String returnBook() {
        System.out.println("Мы возвращаем книгу в библиотеку Университета");
        return "Леонид";
    }
*/
    public void getMagazine(){
        System.out.println("Мы берём журнал из библиотеки Университета");
    }
}
