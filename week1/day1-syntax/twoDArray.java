// Demonstrates 2D arrays and jagged arrays in Java.
// Uses nested enhanced for loops to iterate through and print array elements.
// Shows how 2D arrays can represent structured data with equal or different row lengths.

public class twoDArray {
    public static void main(String[] args){
        char[][] numpad = new char[4][3];

        numpad[0] = new char []{'1', '2', '3'};
        numpad[1] = new char []{'4', '5', '6'};
        numpad[2] = new char []{'7', '8', '9'};
        numpad[3] = new char []{'*', '0', '+'};

        for(char[] row : numpad){
            for(char num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Each category has a different number of items.
        String[][] groceries = {
            {"Mango", "Apple", "Grape"},
            {"Chicken", "Mutton", "Fish", "Shrimp"},
            {"Tomato", "Potato", "Onion", "Pepper", "Mushroom", "Drumstick"}
        };

    for(String[] foods : groceries){
        for(String food : foods){
            System.out.print(food + " ");
        }
        System.out.println();
    }
        
    }
}

// Output
// 1 2 3 
// 4 5 6 
// 7 8 9 
// * 0 + 

// Mango Apple Grape 
// Chicken Mutton Fish Shrimp 
// Tomato Potato Onion Pepper Mushroom Drumstick 