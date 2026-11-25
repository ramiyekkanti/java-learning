package concept.inheritance;

public class Employee {
    private String name;

    public Employee(String name){
        this.name = name;
    }

    public String describe(){
        return "Employee: " + name;
    }
}
