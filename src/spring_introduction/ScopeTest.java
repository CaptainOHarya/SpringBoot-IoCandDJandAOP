package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext31.xml");

        Dog dog = context.getBean("dog", Dog.class);
        dog.say();

     /*   Dog yourDog = context.getBean("dog", Dog.class);

        System.out.println("Переменные ссылаются на один и тот же объект? " + (dog == yourDog));
        System.out.println(dog);
        System.out.println(yourDog);*/
        context.close();

    }
}
