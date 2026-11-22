package week1.inheritance;

public class Person {
    final String name;
    private int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age){
        if(age >= 0 && age <= 120) this.age = age;
        else 
            System.out.println("Invalid age");
    }
    
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return name + " (" + age + ")";
    }
}
