package week1.inheritance;

public class Manager extends Employee{
    int teamSize;

    Manager(String name, int teamSize){
        super(name);
        this.teamSize = teamSize;
    }

    @Override
    public String describe(){
        return super.describe() + ", manages " + teamSize + " people";
    }
}
