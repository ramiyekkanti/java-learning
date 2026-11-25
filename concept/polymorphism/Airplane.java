package concept.polymorphism;

public class Airplane implements Flyable{
    @Override
    public void fly(){
        System.out.println("Airplane flies");
    }
}
