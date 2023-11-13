package fish;

public class Pike extends Fish {
    public Pike(String kind, String colour, int yearOfBirth) {
        super(kind, colour, yearOfBirth);
    }
    @Override
    public void move() {
        System.out.printf("%s moves on four legs. ", getKind());
    }

    public void chaseAfterMice() {
        System.out.printf("%s chasing mice. ", getKind());
    }
}
