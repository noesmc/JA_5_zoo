package animals;

public class Lion extends Animals {
    public Lion(String kind, String name, String colour, boolean tail, boolean mane) {
        super(kind, name, colour, tail, mane);
    }
    public static void lionHunt() {
        System.out.println("The lion is hunting its prey!");
    }
}
