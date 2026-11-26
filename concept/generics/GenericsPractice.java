package concept.generics;

import java.util.Objects;

public class GenericsPractice {
    public static void main(String[] args){
        Box<String> s = new Box<>("hello");
        Box<Integer> n = new Box<>();
        System.out.println(s);
        System.out.println(n);
        System.out.println(n.isEmpty());
        n.set(42);
        System.out.println(n);
        System.out.println(n.get() + 1);
        System.out.println();

        // Pair Class
        Pair<String, Integer> p = new Pair<>("Asha", 28);
        System.out.println(p);
        Pair<Integer, String> q = p.swap();
        System.out.println(q);
        System.out.println(q.getFirst() + 1);
        System.out.println();

        // Largest
        System.out.println(largest(new Integer[]{3, 9, 4}));
        System.out.println(largest(new String[] {"pear", "apple", "zebra"}));
        System.out.println(largest(new Double[] {1.5, -2.0}));
        System.out.println(largest(new Integer[]{}));
        System.out.println();

        // Printing and Searching
        printAll(new String[]{"red", "green"});
        System.out.println(contains(new Integer[]{1, 2, 3}, 2));
        System.out.println(contains(new Integer[]{1, 2, 3}, 5));
        System.out.println(contains(new String[]{"a", "b"}, "b"));
        System.out.println();

        // Wrapper Demo
        wrapperDemo();
        System.out.println();


    }

    // Methods
    public static void wrapperDemo(){
        Integer a = 127;
        Integer b = 127;
        System.out.println("a == b: " + (a == b));

        Integer c = 128;
        Integer d = 128;
        System.out.println("c == d: " + (c == d));
        System.out.println("c.equals(d): " + c.equals(d));

        Integer total = 0;
        for(int i = 1; i <= 3; i++){
            total += i;
        }
        System.out.println("Total: " + total);
        System.out.println(Integer.parseInt("55") + 1);
    
        try{
            Integer numb = null;
            int val = numb;
            System.out.println("Value: " + val);
        }catch(NullPointerException e){
            System.out.println(e.getClass().getSimpleName());
        }
    }

    public static <K> void printAll(K[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(i + ": " + arr[i]);
        }
    }

    public static <K> boolean contains(K[] arr, K target){
        for(K value : arr){
            if(Objects.equals(value,target)) return true;
        }
        return false;
    }

    public static <K extends Comparable<K>> K largest(K[] arr){
        if(arr.length == 0) return null;
        K max = arr[0];

        for(int i = 1; i < arr.length; i++){
            int status = arr[i].compareTo(max);
            if(status > 0){
                max = arr[i];
            }
        }
        return max;
    }
}
