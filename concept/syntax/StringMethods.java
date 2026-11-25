package concept.syntax;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String uname = sc.nextLine();

        System.out.print("Enter your password: ");
        String pass = sc.nextLine();

        if(pass.equalsIgnoreCase("password")){
            System.out.println("You can't have 'password' as your password.");
        }else{
            System.out.printf("Hi %s, your account is created.%n", uname);

            int len = uname.length();
            System.out.println("Your username is of length: " + len);

            int index = uname.indexOf("i");
            System.out.println("The first index of 'i' is: " + index);
        
            int lIndex = uname.lastIndexOf("i");
            System.out.println("The last index of 'i' is: " + lIndex);

            System.out.println("Is username empty?: " + uname.isEmpty());
            System.out.println("Is username blank?: " + uname.isBlank());
            System.out.println("Your username starts with 'r'?: " + uname.startsWith("r"));
            System.out.println("Your username ends with 'r'?: " + uname.endsWith("r"));
            System.out.println("Your username in uppercase: " + uname.toUpperCase());
            System.out.println("Your username in lowercase: " + uname.toLowerCase());
            System.out.println("The char at index 5 is: " + uname.charAt(5));
            System.out.println("The username contains the word rami: " + uname.contains("rami"));
            System.out.println("The username after replacing surname: " + uname.replace("yekkanti", "y"));

            int indexOfFirstSpace = uname.indexOf(" ");
            System.out.println("Your name is: " + uname.substring(0, indexOfFirstSpace));
            
            "Hello World".contains("World"); // true
        }
        sc.close();
    }
}
