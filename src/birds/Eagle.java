package birds;

public class Eagle extends Bird {
    public Eagle(String name, String colour, int yearOfBirth) {
        super(name, colour, yearOfBirth);
    }

    @Override
    public void move() {
        System.out.printf("%s moves by using its powerful wings for flight. They can climb to great heights, " +
                          "soar through the air, and make steep peaks and turns in search of prey. ", getName());
    }

    @Override
    public void voice(String voice) {
        System.out.printf("Voices like \"%s\". ", voice);
    }

    public void hunt() {
        System.out.printf("%s is hunting its prey using sharp vision and powerful claws. ", getName());
    }
}
