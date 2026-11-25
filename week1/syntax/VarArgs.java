// Varargs (variable-length arguments) allows a method to accept zero or more arguments of the specified type.
// The ... syntax allows us to pass multiple individual values or an existing array without explicitly creating an array.
// Inside the method, varargs is treated as an array, which we can iterate through using a loop.

public class VarArgs {
    public static void main(String[] args){
        System.out.println("The sum of 0 = " + addNumbers());
        System.out.println("The sum of 1 = " + addNumbers(1));
        System.out.println("The sum of 1, 2 = " + addNumbers(1, 2));
        System.out.println("The sum of 1, 2, 3 = " + addNumbers(1, 2, 3));
        System.out.println("The sum of 1, 2, 3, 4 = " + addNumbers(1, 2, 3, 4));
        System.out.println("The sum of 1, 2, 3, 4, 5 = " + addNumbers(1, 2, 3, 4, 5));
        
        int[] arr = {10, 12, 15, 7, 89, 152, 1286, -25, -1000};
        System.out.println("The sum of 10, 12, 15, 7, 89, 152, 1286, -25, -1000 = " + addNumbers(arr));
        
    }   
    
    public static int addNumbers(int... numbers){
        int total = 0;
        for(int num : numbers){
            total += num;
        }
        return total;
    }
}


// Output
// The sum of 0 = 0
// The sum of 1 = 1
// The sum of 1, 2 = 3
// The sum of 1, 2, 3 = 6
// The sum of 1, 2, 3, 4 = 10
// The sum of 1, 2, 3, 4, 5 = 15
// The sum of 10, 12, 15, 7, 89, 152, 1286, -25, -1000 = 546
