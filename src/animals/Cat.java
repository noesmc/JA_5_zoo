package animals;

public class Cat extends Animal {
    public Cat(String name, String colour, int yearOfBirth) {
        super(name, colour, yearOfBirth);
    }

    @Override
    public void voice(String voice) {
        System.out.printf("Voices like \"%s\". ", voice);
    }

    public void chaseAfterMice() {
        System.out.printf("%s chasing mice. ", getName());
    }
}
