package week1.polymorphism;

public class Circle extends Shape{
    double radius;

    Circle(double radius){
        super("Circle");
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}
