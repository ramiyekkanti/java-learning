package week1.inheritance;

public class Employee {
    private String name;

    Employee(String name){
        this.name = name;
    }

    public String describe(){
        return "Employee: " + name;
    }
}
