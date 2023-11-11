package animals;

import actions.Actions;

public abstract class Animals implements Actions {
    protected String kind;
    protected String name;
    protected String colour;
    protected boolean tail;
    protected boolean mane;

    public Animals(String kind, String name, String colour, boolean tail, boolean mane) {
        this.kind = kind;
        this.name = name;
        this.colour = colour;
        this.tail = tail;
        this.mane = mane;
    }

    public String getName() {
        return name;
    }

    public void getInfo() {
        System.out.printf("""
                The kind is "%s", called %s. %s's colour is %s. He %s, %s.\s""",
                kind, name, name, colour, tail ? "has tail" : "hasn't got tail",
                mane ? "has mane" : "hasn't got mane");
    }
}
