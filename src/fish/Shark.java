package fish;

public class Shark extends Fish {
    public Shark(String colour, int yearOfBirth) {
        super(colour, yearOfBirth);
    }

    public void moveAndHunt() {
        System.out.printf("%s is able to hunt constantly due to its ability to pass water through its gills and " +
                          "obtain oxygen. ", getKind());
    }
}

