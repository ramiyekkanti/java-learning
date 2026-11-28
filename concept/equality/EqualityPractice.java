package concept.equality;

import java.util.Arrays;
import java.util.HashSet;

public class EqualityPractice {
    public static void main(String[] args){
        // Student Class
        Student s1 = new Student(1, "Asha");
        Student s2 = new Student(1, "Asha R");
        Student s3 = new Student(2, "Rami");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(null));
        System.out.println(s1.equals("Asha"));
        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(s1);
        System.out.println();

        HashSet<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set.size());
        System.out.println(set.contains(new Student(2, "Anyone")));
        System.out.println(set.contains(new Student(3, "Meena")));
        System.out.println();

        // Broken Student Class
        BrokenStudent b1 = new BrokenStudent(1, "Asha");
        BrokenStudent b2 = new BrokenStudent(1, "Asha");
        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode() == b2.hashCode());

        // The below brokenSet puts two entries with the same id and name 
        // even though equals() method says they are same, 
        // because the hashcode is differnet for the two objects as the hashcode 
        // is not overrided.
        HashSet<BrokenStudent> brokenSet = new HashSet<>();
        brokenSet.add(b1);
        brokenSet.add(b2);
        System.out.println(brokenSet.size());
        System.out.println();

        // Book Class
        Book[] books = {
            new Book("A1", "Java Basics", 300),
            new Book("A1", "Java Basics 2nd Ed", 350),
            new Book("B2", "Spring Boot", 500),
            new Book("A1", "Java Basics (used)", 120)
        };
        System.out.println(countDistinct(books));
        System.out.println(countDistinct(new Book[]{}));
        System.out.println();
        
        // Employee Class
        Employee[] staff = {
            new Employee("Asha", 50000),
            new Employee("Ravi", 40000),
            new Employee("Meena", 50000),
            new Employee("Rami", 60000)
        };
        Arrays.sort(staff);
        for(Employee e : staff){
            System.out.println(e);
        }
        System.out.println();

        // Tag Class
        HashSet<Tag> tags = new HashSet<>();
        Tag t = new Tag(1);
        tags.add(t);
        System.out.println(tags.contains(t));
        t.setN(2);
        // Changing n doesn't remove the object from the set. 
        // It only makes the set unable to find it through the usual hash-based lookup and fail to loacate it and return false.
        System.out.println(tags.contains(t));
        System.out.println(tags.size());
        System.out.println();

        // Address Class
        Address a1 = new Address(null);
        Address a2 = new Address(null);
        Address a3 = new Address("Pune");
        Address a4 = new Address("Pune");
        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));
        System.out.println(a3.equals(a1));
        System.out.println(a3.equals(a4));
        System.out.println(a1.hashCode() == a2.hashCode());
        System.out.println(a3.hashCode() == a4.hashCode());
        
    }

    // Methods
    public static int countDistinct(Book[] books){
        HashSet<Book> bookSet = new HashSet<>();
        for(Book book : books){
            bookSet.add(book);
        }
        return bookSet.size();
    }
}
