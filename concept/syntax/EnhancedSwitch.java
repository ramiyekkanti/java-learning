package concept.syntax;
import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What day of the week is it?: ");
        String day = sc.next().toLowerCase();

        switch(day){
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> 
                System.out.println("It is a weekday, booooo.");
            case "saturday", "sunday" -> 
                System.out.println("It is a weekend, hurray.");
            default -> System.out.printf("%s is not a day !!!%n", day);
        }
        sc.close();
    }
}
