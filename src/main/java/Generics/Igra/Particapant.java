package Generics.Igra;

public  abstract class Particapant {

    private String name;
    private int age;

    public Particapant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
