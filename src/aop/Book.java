package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component

public class Book {
    @Value("\"Всё о приручении оленей\"")// используем хардкодовый вариант
    private String name;

    @Value("Марина Тундра")
    private String author;

    @Value("2022")
    private int yearOfPublication;

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getName() {
        return name;
    }
}