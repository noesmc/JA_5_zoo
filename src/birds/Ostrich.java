package birds;

public class Ostrich extends Bird {
    public Ostrich(String name, String colour, int yearOfBirth) {
        super(name, colour, yearOfBirth);
    }

    @Override
    public void move() {
        System.out.printf("%s move around using their wings to fly, they can also walk and swim on the" +
                          " surface of the water. ", getName());
    }

    @Override
    public void voice(String voice) {
        System.out.printf("Voices like \"%s\". ", voice);
    }

    public void run() {
        System.out.printf("%s can run at speeds of up to 70 kilometers per hour. ", getName());
    }

    public void defend() {
        System.out.printf("%s can defend itself with its powerful legs. ", getName());
    }
}
