package week1.inheritance;

public class Dog extends Animal{
    Dog(String name){
        super(name);
    }

    @Override
    public void speak(){
        System.out.println(super.getName() + " says Woof");
    }

    public void fetch(){
        System.out.println(super.getName() + " fetches the ball");
    }
}
