package Part4;

public class Movie {
    private String title;
    private String directorName;
    private int releaseYear;

    public Movie(String title, String directorName, int releaseYear) {
        this.title = title;
        this.directorName = directorName;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public String getDirectorName() {
        return directorName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String toString() {
        return getTitle() + ", directed by " + getDirectorName() + ", released in " + getReleaseYear();
    }  

    
}
