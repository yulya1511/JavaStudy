package TrainJob;

public class Schooler extends Pupils {

    int numberOfClass;

    public Schooler(String name, int age, double avGrade, int numberOfClass) {
        super(name, age, avGrade);
        this.numberOfClass = numberOfClass;

    }

    @Override
    void study() {
        System.out.println("Учусь в школе");
    }
}
