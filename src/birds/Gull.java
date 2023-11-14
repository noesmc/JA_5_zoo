package birds;

public class Gull extends Bird {
    public Gull(String name, String colour, int yearOfBirth) {
        super(name, colour, yearOfBirth);
    }

    @Override
    public void move() {
        System.out.printf("%s move around using their wings to fly, they can also walk and swim on the surface " +
                          "of the water. ", getName());
    }

    @Override
    public void voice(String voice) {
        System.out.printf("Voices like \"%s\". ", voice);
    }

    public void swim() {
        System.out.printf("%s can swim in water. ", getName());
    }
}
