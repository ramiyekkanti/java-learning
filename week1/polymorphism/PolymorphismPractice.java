package week1.polymorphism;

public class PolymorphismPractice {
    public static void main(String[] args){

        // Shape, Circle, Rectangle, Triangle Classes
        Shape[] shapes = {
            new Circle(1), 
            new Rectangle(3, 4), 
            new Triangle(6,5)
        };

        double total = 0;

        for(Shape shape : shapes){
            System.out.println(shape.describe());
            total += shape.area();
        }

        System.out.println("Total area: " + String.format("%.2f", total));

        // Payable, Hourly, Salaried Classes
        Payable[] workers = {
            new Salaried(50000),
            new Hourly(500, 40)
        };

        for(Payable worker : workers){
            System.out.println("Pay: " + String.format("%.2f", worker.pay()));
            System.out.println("With 10% bonus: " + String.format("%.2f", worker.payWithBonus(10)));
        }
    }
}
