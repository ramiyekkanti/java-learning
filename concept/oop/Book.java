package concept.oop;

public class Book {
    private String title;
    private String author;
    private int pages;

    Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    Book(String title, String author){
        this(title, author, 0);
    }

    boolean isLong(){
        return pages > 300 ? true : false;
    }

    @Override
    public String toString(){
        return title + " by " + author + "(" + pages + " pages)";
    }
}
