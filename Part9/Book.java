package Part9;

public class Book extends AbstractReadingMaterial {

    private String title;
    private String author;
    private String ISBN;
    private String type;
    private String description;

    public Book(String title, String author, String ISBN, String type, String description) {
        super(title, author, ISBN, type);
        this.description = description;
    }

    @Override
    public String getType() {
        return "Book";
    }

    public String getDescription() {
        return getType() + " " + description;
    }
    
}
