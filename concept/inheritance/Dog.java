package week1.inheritance;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    public void speak(){
        System.out.println(super.getName() + " says Woof");
    }

    public void fetch(){
        System.out.println(getName() + " fetches the ball");
    }
}
