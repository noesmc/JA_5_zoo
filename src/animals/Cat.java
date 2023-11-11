package animals;

public class Cat extends Animals {
    public Cat(String kind, String name, String colour, boolean tail, boolean mane) {
        super(kind, name, colour, tail, mane);
    }
    @Override
    public void movement() {
        System.out.printf("%s moves on five legs. ", getName());
    }
    @Override
    public void voice(String voice) {
        System.out.printf("Voices like \"%s\". ", voice);
    }

    public void chaseAfterMice() {
        System.out.printf("%s chasing mice around the apartment. ", getName());
    }
}
