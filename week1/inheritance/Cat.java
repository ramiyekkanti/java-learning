package week1.inheritance;

public class Cat extends Animal{
    Cat(String name){
        super(name);
    }
    
    @Override
    public void speak(){
        System.out.println(super.getName() + " says Meow");
    }
}
