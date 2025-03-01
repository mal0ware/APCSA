public class TextBook extends Book {
    private String subject;
    private String edition;

    // Constructor
    public TextBook(String title, String author, String subject, String edition) {
        super(title, author);  // Call the parent class constructor (Book)
        this.subject = subject;
        this.edition = edition;
    }

    // Getters
    public String getSubject() {
        return subject;
    }

    public String getEdition() {
        return edition;
    }

    // Setters
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }
}