package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;
// Демонстрация bean Singleton
public class Test4 {
    public static void main(String[] args) {
        // создание Spring-контейнера
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        //  дважды запросили бин
        Parrot parrot = context.getBean("myPet", Parrot.class);
        parrot.setName("Гоша");
        Parrot yourParrot = context.getBean("myPet", Parrot.class);
        yourParrot.setName("Кеша");

        System.out.println(parrot.getName());
        System.out.println(yourParrot.getName());


        System.out.println("Переменные ссылаются на один и тот же объект? " + (parrot == yourParrot));
        System.out.println(parrot);
        System.out.println(yourParrot);
        context.close();

    }
}
