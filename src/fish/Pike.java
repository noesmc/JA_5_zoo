package fish;

public class Pike extends Fish {
    public Pike(String colour, int yearOfBirth) {
        super(colour, yearOfBirth);
    }

    public void holdAndAttack() {
        System.out.printf("%s is capable of holding prey in its teeth and then attacking lightning fast. ", getKind());
    }
}
