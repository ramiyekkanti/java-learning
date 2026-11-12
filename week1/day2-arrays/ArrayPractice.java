import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){
        int[] a = {4, 8, 15, 16, 23, 42};
        printInfo(a);
        System.out.println("Sum: " + sum(a));
        System.out.println("Average: " + average(a));

        System.out.println("Max: " + findMax(a));
        System.out.println("Min: " + findMin(a));

        int[] original = {1, 2, 3};
        int[] result = doubled(original);
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Result: " + Arrays.toString(result));
        
        reverseInPlace(a);
        System.out.println("Inplace Reverse: " + Arrays.toString(a));

        
        System.out.println("Count: " + count(a, 9));
        copyTrap();
        gridDemo();
        outOfBounds();
    }

    public static void printInfo(int[] a){
        System.out.println("Array: " + Arrays.toString(a));
        System.out.println("Length: " + a.length);
        System.out.println("First: " + a[0]);
        System.out.println("Last: " + a[a.length - 1]);  
    }

    public static int sum(int[] a){
        int sum = 0;

        for(int n : a){
            sum += n;
        }
        return sum;
    }

    public static double average(int[] a){
        int sum = sum(a);
        double avg = (double) sum / a.length;
        return avg; 
    }

    public static int findMax(int[] a){
        int max = a[0];

        for(int i = 1; i < a.length; i++){
            if(a[i] > max) max = a[i];
        }
        return max;
    }

    public static int findMin(int[] a){
        int min = a[0];

        for(int i = 1; i < a.length; i++){
            if(a[i] < min) min = a[i];
        }
        return min;
    }

    public static int[] doubled(int[] a){
        int[] newArr = new int[a.length];
        
        for(int i = 0; i < a.length; i++){
            newArr[i] = a[i] + a[i];
        }
        return newArr;
    }

    public static void reverseInPlace(int[] a){
        int left = 0, right = a.length - 1;

        while(left < right){
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }
    }

    public static int count(int[] a, int target){
        int count = 0;

        for(int n : a){
            if(n == target) count++;
        }
        return count;
    }

    public static void copyTrap(){
        int[] a = {1, 2, 3};
        int[] b = a;
        b[0] = 99;
        System.out.println("a after b changed: " + Arrays.toString(a));

        int[] c = Arrays.copyOf(a, a.length);
        c[1] = 55;
        System.out.println("a: " + Arrays.toString(a));
        System.out.println("c: " + Arrays.toString(c));
    }

    public static void gridDemo(){
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for(int i = 0; i < grid.length; i++){
            System.out.println(Arrays.toString(grid[i]));
        }
        
        System.out.println("Rows: " + grid.length);
        System.out.println("Columns: " + grid[0].length);

        int total = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                total += grid[i][j];
            }
        }
        System.out.println("Total: " + total);
    }

    public static void outOfBounds(){
        int[] a = {1, 2, 3};
        // System.out.println("Out of bounds a[3]: " + a[3]);
    }
}
