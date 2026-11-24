package week1.polymorphism;

public class Duck implements Flyable, Swimmable{
    @Override
    public void fly(){
        System.out.println("Duck flies");
    }

    @Override
    public void swim(){
        System.out.println("Duck swims");
    }
}
