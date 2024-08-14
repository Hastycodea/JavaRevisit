package Part9;

public class Magazine extends AbstractReadingMaterial{

    private String title;
    private String author;
    private String ISBN;
    private String type;
    private int issueNumber;
    private String description;

    public Magazine(String title, String author, String ISBN, String type) {
        super(title, author, ISBN, type);
    }

    @Override
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
