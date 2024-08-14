package Part9;

import java.util.ArrayList;

public class LibraryCatalog {

    ArrayList<ReadingMaterial> materials;

    public LibraryCatalog() {
        this.materials = new ArrayList<>();
    }

    public void addReadingMaterial(ReadingMaterial material) {
        materials.add(material);
    }

    public void printCatalog() {
        materials.stream().forEach(n -> System.out.println(n));
    }

    

    
}
