package spring_introduction;

public class Parrot implements Pet{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Гоша хороший");
    }

    public Parrot() {
        System.out.println("Parrot bean is created");
    }
}
