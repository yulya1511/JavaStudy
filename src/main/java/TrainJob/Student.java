package TrainJob;

public class Student extends Pupils {

    int course;

    public Student(String name, int age, double avGrade, int course) {
        super(name, age, avGrade);
        this.course = course;
    }

    @Override
    void study(){
        System.out.println("Учусь в университете");
    }
}
