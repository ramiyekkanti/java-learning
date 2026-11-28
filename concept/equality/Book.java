package concept.equality;

import java.util.Objects;

public class Book {
    private final String ISBN;
    private final String title;
    private final double price;

    public Book(String ISBN, String title, double price){
        this.ISBN = ISBN;
        this.title = title;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        else if(obj == null || this.getClass() != obj.getClass())
            return false;

        Book other = (Book) obj;
        return this.ISBN == other.ISBN;
    }

    @Override
    public int hashCode(){
        return Objects.hash(ISBN);
    }

    @Override
    public String toString(){
        return "Book: [" + ISBN + ", " + title + ", " + price + "]";
    }
}
