package Part7;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception{

        ArrayList<Movies> movies = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        System.out.println();        

        try {
            scanner = new Scanner (new File(file));
            while(scanner.hasNextLine()) {
                String title = scanner.nextLine();
                int releaseYear = Integer.parseInt(scanner.nextLine());

                ArrayList<String> genres = new ArrayList<>();
                while (scanner.hasNextLine()) {
                    String genre = scanner.nextLine();
                    if (genre.isEmpty()) {
                        break;
                    }
                    genres.add(genre);
                }
                movies.add(new Movies(title, releaseYear, genres));
            }
    
            
        } catch (Exception e) {
                e.printStackTrace();
        }

        System.out.println("Commands: ");
        System.out.println("list - lists the movies");
        System.out.println("stop - stops the program");
        System.out.println("find title - searches movies by title");
        System.out.println("find release year - searches movies by release year");
        System.out.println("find genre - searches movies by genre");
        Scanner scan = new Scanner(System.in);
        System.out.println();

        while (true) {
            System.out.print("Enter command: ");
            String command = scan.nextLine(); 

            if (command.equalsIgnoreCase("stop")) {
                break;
            } else if (command.equalsIgnoreCase("list")) {
                System.out.println("Movies:");
                for(Movies movie : movies) {
                    System.out.println(movie.toString());
                }
            } else if (command.equalsIgnoreCase("find title")) {
                Scanner scanner2 = new Scanner(System.in);
                System.out.print("Searched word: ");
                String title = scanner2.nextLine();

                for (Movies movie : movies) {
                    if (movie.getTitle().toLowerCase().contains(title.toLowerCase())) {
                        System.out.println(movie.toString());
                    }
                }

            } else if (command.equalsIgnoreCase("find release year")) {
                Scanner scanner3 = new Scanner(System.in);
                System.out.print("Earliest release year: ");
                int year = Integer.parseInt(scanner3.nextLine());
                for(Movies movie : movies) {
                    if (movie.getReleaseYear() >= year) {
                        System.out.println(movie.toString());
                    }
                }
            } else if (command.equalsIgnoreCase("find genre")) {
                Scanner scanner4 = new Scanner(System.in);
                System.out.print("Genre: ");
                String genreInput = scanner4.nextLine();
                for(Movies movie : movies) {
                    for(String genre : movie.getGenre()) {
                        if (genre.toLowerCase().contains(genreInput.toLowerCase())) {
                            System.out.println(movie.toString());
                        }
                    }
                }
            }
            System.out.println();
        }

    }

    
    
}
