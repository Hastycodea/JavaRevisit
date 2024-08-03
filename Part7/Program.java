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
        System.out.println("list - lists the movies \nstop - stops the program\n");
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter command: ");
            String command = scan.nextLine(); 

            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                System.out.println("Movies:");
                for(Movies movie : movies) {
                    System.out.println(movie.toString());
                }
            }
            System.out.println();
        }

    }
    
}
