package birds;

import actions.Actions;

import java.util.Calendar;

public abstract class Birds implements Actions {
    protected String kind;
    protected String name;
    protected String colour;
    protected int yearOfBirth;

    public Birds(String kind, String name, String colour, int yearOfBirth) {
        this.kind = kind;
        this.name = name;
        this.colour = colour;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public static int getYear() {
        int year;
        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        return year;

    }

    public void getInfo() {
        System.out.printf("The kind is \"%s\", called %s. %s's colour is %s. He is %d. ",
                kind,
                name,
                name,
                colour,
                getYear() - yearOfBirth);
    }
}
