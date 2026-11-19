package week1.oop;

public class OopPractice {
    public static void main(String[] args){

        // Rectangle Class
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(3, 3);
        System.out.println(r1);
        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());
        System.out.println(r2);
        System.out.println("Area: " + r2.area());
        System.out.println("Perimeter: " + r2.perimeter());
        System.out.println("---------------------------------------------------");

        // Bank Account Class
        BankAccount acc = new BankAccount("Rami", 500);
        System.out.println(acc);
        acc.deposit(250);
        System.out.println("Balance: " + acc.getBalance());
        boolean ok1 = acc.withdraw(1000);
        System.out.println("Withdraw 1000: " + ok1);
        boolean ok2 = acc.withdraw(200);
        System.out.println("Withdraw 1000: " + ok2);
        System.out.println("Balance: " + acc.getBalance());
        acc.deposit(-5);
        acc.withdraw(0);
        System.out.println("---------------------------------------------------");

        // Counter Class
        System.out.println("Total Counters: " + Counter.getTotalCreated());
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.increment();
        c1.increment();
        c2.increment();
        System.out.println("c1: " + c1.getValue());
        System.out.println("c2: " + c2.getValue());
        System.out.println("Total Counters: " + Counter.getTotalCreated());
        System.out.println("---------------------------------------------------");

        // Book Class
        Book b1 = new Book("Clean Code", "Robert Martin", 464);
        Book b2 = new Book("Draft", "Rami");
        Book b3 = new Book("Clean Draft", "Robartin", 894);
        System.out.println(b1);
        System.out.println("Long: " + b1.isLong());
        System.out.println(b2);
        System.out.println("Long: " + b2.isLong());
        System.out.println(b3);
        System.out.println("Long: " + b3.isLong());
        System.out.println("---------------------------------------------------");

        // References
        Rectangle a = new Rectangle(2, 3);
        Rectangle b = a;
        b.setWidth(10);
        System.out.println(a);
        Rectangle c = new Rectangle(2, 3);
        System.out.println("a == b: " + (a == b));
        System.out.println("a == c: " + (a == c));
        System.out.println("---------------------------------------------------");

        // Null Pointer Exception
        Rectangle rec = null;
        System.out.println(rec);
        // Exception in thread "main" java.lang.NullPointerException: 
        // Cannot invoke "week1.oop.Rectangle.getWidth()" because "rec" is null
        // System.out.println(rec.getWidth());
        System.out.println("---------------------------------------------------");

        Rectangle[] list = new Rectangle[3];
        System.out.println(list[0]);
        for (int i = 0; i < list.length; i++) {
            list[i] = new Rectangle(i + 1, i + 1);
        }
        System.out.println(list[0]);

        int total = 0;
        for(Rectangle rect : list){
            total += rect.area();
        }
        System.out.println("Total Area of Rectangles: " + total);        
        System.out.println("---------------------------------------------------");
    }
}
