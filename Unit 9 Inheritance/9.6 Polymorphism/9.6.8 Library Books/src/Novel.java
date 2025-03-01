public class Novel extends Book {
    private String genre;
    private int pages;

    // Constructor
    public Novel(String title, String author, String genre, int pages) {
        super(title, author);  // Call the parent class constructor (Book)
        this.genre = genre;
        this.pages = pages;
    }

    // Getters
    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }

    // Setters
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}