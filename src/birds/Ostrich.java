package birds;

public class Ostrich extends Birds {
    public Ostrich(String kind, String name, String colour, int yearOfBirth) {
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

    public void chaseAfterMice() {
        System.out.printf("%s chasing mice. ", getName());
    }
}
