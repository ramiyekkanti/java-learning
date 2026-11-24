package week1.polymorphism;

public class Circle extends Shape{
    double radius;

    Circle(double radius){
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}
