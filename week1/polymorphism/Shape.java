package week1.polymorphism;

public abstract class Shape {
    private String name;

    protected Shape(String name){
        this.name = name;
    }

    public abstract double area();

    public String describe(){
        return name + " area = " + String.format("%.2f", area());
    }
}
