package Part7;

import java.util.ArrayList;

public class Movies {
    private String title;
    private int releaseYear;
    private ArrayList<String> genre;

    public Movies (String title, int releaseYear, ArrayList<String> genre) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public ArrayList<String> getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return getTitle() + ", release year: " +getReleaseYear();
    }

    
}
