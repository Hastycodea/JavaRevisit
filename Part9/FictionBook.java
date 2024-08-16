package Part9;

public class FictionBook extends Book {

    private String title;
    private String author;
    private String ISBN;
    private String type;
    private String description;

    public FictionBook (String title, String author, String ISBN, String type, String description) {
        super(title, author, ISBN, type, description);
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.type = type;
        this.description = description;
    }

    public String getType() {
        return "Fiction Book";
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "FictionBook [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", type=" + type
                + ", description=" + description + "]";
    }

    

    

    
    
}
