package Part9;


public class Magazine extends AbstractReadingMaterial{

    private String title;
    private String author;
    private String ISBN;
    private String type;
    private int issueNumber;
    private String description;

    public Magazine(String title, String author, String ISBN, String type, int issueNumber, String description) {
        super(title, author, ISBN, type);
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.type = type;
        this.issueNumber = issueNumber;
        this.description = description;

    }

    public String getType() {
        return "Magazine";
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public String getDescription() {
        return getType() + " " + getIssueNumber();
    }

    @Override
    public String toString() {
        return "Magazine [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", type=" + type
                + ", issueNumber=" + issueNumber + ", description=" + description + "]";
    }

    
    
}
