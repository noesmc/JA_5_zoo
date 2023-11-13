package animals;

public class Dog extends Animal {
    public Dog(String name, String colour, int yearOfBirth) {
        super(name, colour, yearOfBirth);
    }

    @Override
    public void move() {
        System.out.printf("%s moves on four legs. ", getName());
    }

    @Override
    public void voice(String voice) {
        System.out.printf("Voices like \"%s\". ", voice);
    }

    public void track() {
        System.out.printf("%s can track the target. ", getName());
    }
}
