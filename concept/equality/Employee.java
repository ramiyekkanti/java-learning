package concept.equality;

public class Employee implements Comparable<Employee> {
    private final String name;
    private final int salary;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return name + " (" + salary + ")";
    }

    @Override
    public int compareTo(Employee e) {
        if(this.salary > e.salary) return 1;
        else if(this.salary < e.salary) return -1;
        else return this.name.compareTo(e.name);
    }
}
