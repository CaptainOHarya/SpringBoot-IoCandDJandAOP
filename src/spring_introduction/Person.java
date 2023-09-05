package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    //@Autowired
    //@Qualifier("dog")// dog - бин по умолчанию
    // @Qualifier("catBean") - нужен если несколько таких pet
    private Pet pet;
   // @Value("Zulin") - это хардкодовое написание
    // лучше через файл настроек
    //@Value("${person.surname}")
    private String surname;

    // @Value("49") - - это хардкодовое написание
    // лучше через файл настроек
   // @Value("${person.age}")
    private int age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class person: set age");
        this.age = age;
    }

    public Person() {
        System.out.println("Person bean is created");
    }

 /*   @Autowired
    // @Qualifier("catBean") - нужен если несколько таких pet
    public Person(@Qualifier("catBean") Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }*/


    // @Autowired
    // @Qualifier("catBean") - нужен если несколько таких pet
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet");
        pet.say();

    }
}
