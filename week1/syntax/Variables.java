public class Variables {
    public static void main(String[] args){
        int age = 28;
        long number = 9826836L;
        double weight = 73.5;
        boolean employed = false;
        char gender = 'M';
        String name = "Rami";

        System.out.println("Age: " + age);
        System.out.println("Number: " + number);
        System.out.println("Weight: " + weight);
        System.out.println("Employed: " + employed);
        System.out.println("Gender: " + gender);
        System.out.println("Name: " + name);
        
        // prediction: 3
        System.out.println(7 / 2);

        // prediction: 3.5
        System.out.println(7 / 2.0);

        // prediction: 1
        System.out.println(7 % 2);
        
        // prediction: -1
        System.out.println(-7 % 3);
        
        // prediction: 3
        System.out.println((int) 3.99);
        
        // prediction: 0.3 
        System.out.println(0.1 + 0.2); // wrong: I expected 0.3, got 0.30000000000000004, because computers store double values in binary, and 0.1 and 0.2 have no exact binary form, just as 1/3 has no exact decimal form. Each is stored as a tiny approximation, and the error shows up in the sum.

        char c = 'A';
        // prediction: 66
        System.out.println(c + 1);
        // prediction: B
        System.out.println((char) (c + 1));

        final int DAYS = 7;
        // DAYS = 8; The final variable DAYS cannot be assigned or changed again.

        // prediction: Sum: 12
        System.out.println("Sum: " + 1 + 2);
        
        // prediction: 3 Sum
        System.out.println(1 + 2 + " Sum");
    }
}
