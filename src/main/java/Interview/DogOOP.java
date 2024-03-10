package Interview;

public class DogOOP extends AnimalOOP {

    static int count;

    public DogOOP(String name) {
        super(name, 500, 10);
        count++;
    }
}
