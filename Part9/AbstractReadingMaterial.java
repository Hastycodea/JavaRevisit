package Part9;

public abstract class AbstractReadingMaterial implements ReadingMaterial{

    private String title;
    private String author;
    private String ISBN;
    private String type;

    public AbstractReadingMaterial(String title, String author, String ISBN, String type) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.type = type;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getISBN() {
        return ISBN;
    } 
    public String getType() {
        return type;
    }
    
}
