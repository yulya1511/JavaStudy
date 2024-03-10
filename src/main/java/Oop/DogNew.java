package Oop;

public class DogNew extends AnimalNew {

    public static int count;

    public DogNew(String name) {
        super(name, 500, 10);
        count+=1;
    }



}
