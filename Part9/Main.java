package Part9;

public class Main {
    public static void main(String[] args) {
        FictionBook fb = new FictionBook("The End", "Kim", "78451284", "Horror", "Fiction");

        NonFictionBook nb = new NonFictionBook("Love", "Ann", "9987y67", "Romance", "Non-fiction");
        Magazine mg = new Magazine("BullFighter", "BonnyTheButcher", "783902", "Entertainment", 78, "Revolution");

        LibraryCatalog catalog = new LibraryCatalog();
        catalog.addReadingMaterial(fb);
        catalog.addReadingMaterial(nb);
        catalog.addReadingMaterial(mg);

        catalog.printCatalog();
 

        // System.out.println(fb.toString());


    }
}

