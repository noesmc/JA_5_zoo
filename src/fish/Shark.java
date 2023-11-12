package fish;

public class Shark extends Fish {
    public Shark(String kind, String colour, int yearOfBirth) {
        super(kind, colour, yearOfBirth);
    }

    @Override
    public void movement() {
        System.out.printf("%s moves on four legs. ", getKind());
    }
}
