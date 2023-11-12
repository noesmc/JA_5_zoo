package birds;

public class Gull extends Birds {
    public Gull(String kind, String name, String colour, int yearOfBirth) {
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
