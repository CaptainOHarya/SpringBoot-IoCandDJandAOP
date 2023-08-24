package spring_introduction;

public class Parrot implements Pet{
    @Override
    public void say() {
        System.out.println("Гоша хороший");
    }

    public Parrot() {
        System.out.println("Parrot bean is created");
    }
}
