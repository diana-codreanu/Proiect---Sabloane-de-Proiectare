package Lab;

public class Author {
    private final String author;

    public Author(String author) {

        this.author = author;
    }

    public void print(){

        System.out.println("Lab.Author: "+ author);
    }
}