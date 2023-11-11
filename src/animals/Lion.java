package animals;

public class Lion extends Animals {
    public Lion(String kind, String name, String colour, boolean tail, boolean mane) {
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

    public void lionHunt() {
        System.out.printf("%s is hunting its prey. ", getName());
    }
}
