package Part5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        processPersonList();
    }

    public static void processPersonList() {
        ArrayList<Person> persons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();

                if (name.isEmpty()) {
                    break;
                }

                System.out.print("Enter ID: ");
                String id = scanner.nextLine();

                if (id.isEmpty()) {
                    break;
                }

                System.out.print("Enter gender: ");
                String gender = scanner.nextLine();

                System.out.print("Enter county: ");
                String county = scanner.nextLine();

                Person person = new Person(name, id, gender, county);
                persons.add(person);

                System.out.println("Added: " + person.toString());
                System.out.println();
        }

        System.out.println("Final list of persons: ");

        for (Person person : persons) {
            System.out.println(person.toString());
        }

    }

}
