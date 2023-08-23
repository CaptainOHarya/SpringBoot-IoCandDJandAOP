package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        // создание Spring-контейнера
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // получим объект из контейнера
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        // необходимо закрывать context
        context.close();

    }
}
