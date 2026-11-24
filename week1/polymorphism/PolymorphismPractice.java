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
        System.out.println("----------------------------------------------------------");

        // Payable, Hourly, Salaried Classes
        Payable[] workers = {
            new Salaried(50000),
            new Hourly(500, 40)
        };

        for(Payable worker : workers){
            System.out.println("Pay: " + String.format("%.2f", worker.pay()));
            System.out.println("With 10% bonus: " + String.format("%.2f", worker.payWithBonus(10)));
        }
        System.out.println("----------------------------------------------------------");
        

        // Flyable, Swimmable, Duck, Fish, and Airplane
        Flyable[] fliers = {
            new Duck(),
            new Airplane()
        };
        
        for(Flyable f : fliers){
            f.fly();
        }

        Swimmable[] swimmers = {
            new Duck(),
            new Fish()
        };
        
        for(Swimmable s : swimmers){
            s.swim();
        }
        System.out.println("----------------------------------------------------------");
        

        // Shapes
        Shape[] mixed = {
            new Circle(1),
            new Rectangle(2, 2),
            new Circle(3)
        };
        int circles = 0;

        for(Shape shape : mixed){
            if(shape instanceof Circle c){
                circles++;
                System.out.println("Radius: "+ c.getRadius());
            }
        }
        System.out.println("Circles: " + circles);
        System.out.println("----------------------------------------------------------");
        
    }
}
