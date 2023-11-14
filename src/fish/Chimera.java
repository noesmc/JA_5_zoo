package fish;

public class Chimera extends Fish {
    public Chimera(String colour, int yearOfBirth) {
        super(colour, yearOfBirth);
    }

    public void hide() {
        System.out.printf("%s is able to camouflage itself due to its distinctive coloration and body shape. ",
            getKind());
    }
}
