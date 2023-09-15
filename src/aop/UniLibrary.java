package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    // здесь рассмотрим метод, принимающий параметры
    public void getBook(String bookName, String bookName2) {
        System.out.println("Мы берём книгу из библиотеки Университета: " + bookName + " и книгу " + bookName2);

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
