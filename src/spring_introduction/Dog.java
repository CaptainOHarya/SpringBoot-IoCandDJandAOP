package spring_introduction;

public class Dog implements Pet{
   // private String name;

  /*  public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    public void init(){
        System.out.println("Class Dog: init method");

    }


    public Dog() {
        System.out.println("Dog bean is created");
    }

    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }

    @Override
    public void say() {
        System.out.println("Гав - Гав");
    }
}
