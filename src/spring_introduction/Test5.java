package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        // создание Spring-контейнера
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext21.xml");

        Dog dog = context.getBean("myPet", Dog.class);
        dog.say();
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.say();

        context.close();

    }
}
