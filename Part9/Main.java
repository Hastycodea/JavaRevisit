package Part9;

public class Main {
    public static void main(String[] args) {
        FictionBook fb = new FictionBook("The End", "Kim", "78451284", "Horror", "Fiction");
        NonFictionBook nb = new NonFictionBook("Love", "Ann", "9987y67", "Romance", "Non-fiction");
        Magazine mg = new Magazine("The People", "Larry", "783928459", "E-news");

        LibraryCatalog catalog = new LibraryCatalog();
        catalog.addReadingMaterial(fb);
        catalog.addReadingMaterial(nb);
        catalog.addReadingMaterial(mg);

        catalog.printCatalog();
    }
}
