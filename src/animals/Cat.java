package animals;

public class Cat extends Animals {
    public Cat(String kind, String name, String colour, boolean tail, boolean mane) {
        super(kind, name, colour, tail, mane);
    }

    public void chaseAfterMice() {
        System.out.println("chasing mice around the apartment");
    }
}
