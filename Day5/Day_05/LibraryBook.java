package day5;

public class LibraryBook {
    // Instance attributes
    String title;
    String author;
    int numPages;
    boolean isOpen;

    // Constructor
    public LibraryBook(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        this.isOpen = false; // Initially closed
    }

    // Method to open the book
    public void openBook() {
        isOpen = true;
    }

    // Method to close the book
    public void closeBook() {
        isOpen = false;
    }

    // Method to display the status of the book
    void displayStatus() {
        String status = isOpen ? "Open" : "Closed";
        System.out.println(title + " by " + author + " is " + status);
    }

    // Main method
    public static void main(String[] args) {
        // Create two LibraryBook objects
        LibraryBook book1 = new LibraryBook("The Alchemist", "Paulo Coelho", 197);
        LibraryBook book2 = new LibraryBook("1984", "George Orwell", 328);

        // Open one book
        book1.openBook();

        // Display status of both
        book1.displayStatus();
        book2.displayStatus();
    }
}
