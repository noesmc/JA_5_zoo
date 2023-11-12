package animals;

public class Lion extends Animals {
    public Lion(String kind, String name, String colour, int yearOfBirth) {
        super(kind, name, colour, yearOfBirth);
    }

    @Override
    public void movement() {
        System.out.printf("%s moves on four legs. ", getName());
    }

    @Override
    public void voice(String voice) {
        System.out.printf("Voices like \"%s\". ", voice);
    }

    public void hunt() {
        System.out.printf("%s is hunting its prey. ", getName());
    }
}
