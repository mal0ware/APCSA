import java.util.ArrayList;

public class BookTester {
    public static void main(String[] args) {
        // Create ArrayList to store books
        ArrayList<Book> library = new ArrayList<>();

        // Add 3 TextBooks to the library
        library.add(new TextBook("Java Programming", "John Doe", "Computer Science", "3rd"));
        library.add(new TextBook("Calculus for Beginners", "Jane Smith", "Mathematics", "2nd"));
        library.add(new TextBook("History of the World", "Dr. Allen", "History", "1st"));

        // Add 3 Novels to the library
        library.add(new Novel("The Great Adventure", "Mark Twain", "Adventure", 300));
        library.add(new Novel("Mystery of the Night", "Sherlock Holmes", "Mystery", 250));
        library.add(new Novel("Love and Betrayal", "Emily Bronte", "Romance", 450));

        // Use a loop to print out the details of each book
        for (Book book : library) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());

            // Check if the book is an instance of TextBook or Novel and print relevant information
            if (book instanceof TextBook) {
                TextBook textBook = (TextBook) book;
                System.out.println("Subject: " + textBook.getSubject());
                System.out.println("Edition: " + textBook.getEdition());
            } else if (book instanceof Novel) {
                Novel novel = (Novel) book;
                System.out.println("Genre: " + novel.getGenre());
                System.out.println("Pages: " + novel.getPages());
            }
            System.out.println();  // Empty line for better readability
        }
    }
}