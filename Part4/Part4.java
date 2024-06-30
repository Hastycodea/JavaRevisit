package Part4;

import java.util.ArrayList;
import java.util.Scanner;

public class Part4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Movie> movies = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Director: ");
            String director = scanner.nextLine();

            System.out.print("Release year: ");
            int releaseYear = Integer.valueOf(scanner.nextLine());

            Movie movie = new Movie(title, director, releaseYear);
            movies.add(movie);
        }

        System.out.print("What information will be printed? ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("all")) {
            for(Movie movie : movies) {
                System.out.println(movie.toString());
            }            
        } else if (input.equalsIgnoreCase("titles")) {
            for(Movie movie : movies) {
                System.out.println(movie.getTitle());
            }
        } else {
            System.out.println("Invalid choice, try again");
        }

    }
}
