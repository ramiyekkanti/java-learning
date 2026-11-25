package concept.inheritance;

public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    
    @Override
    public void speak(){
        System.out.println(super.getName() + " says Meow");
    }
}
