package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
       // Обычное создание через объект
        /* Pet pet = new Dog();
        Person person = new Person(pet);
        person.callYourPet();*/

        // создание через Spring
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Pet pet = context.getBean("myPet", Pet.class);
        // Person person = new Person(pet);
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();

    }
}
