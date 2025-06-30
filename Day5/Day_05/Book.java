package day5;
public class Book {
    
    String title;
    String author;
    int numPages;
    boolean isOpen;
    
    public Book(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        this.isOpen = false; 
    }
    
    public void openBook() {
        isOpen = true;
        System.out.println("The book is now open.");
    }
    
    public void closeBook() {
        isOpen = false;
        System.out.println("The book is now closed.");
    }
   
    public static void main(String[] args) {
        Book myBook = new Book("1984", "George Orwel", 328);
        System.out.println("Title: " + myBook.title);
        System.out.println("Author: " + myBook.author);
        System.out.println("Pages: " + myBook.numPages);
        System.out.println("Is Open: " + myBook.isOpen);

        myBook.openBook();  
        System.out.println("Is Open: " + myBook.isOpen);

        myBook.closeBook();
        System.out.println("Is Open: " + myBook.isOpen);
    }
}

    

