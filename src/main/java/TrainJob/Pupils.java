package TrainJob;

public abstract class Pupils {

    private String name;
    private int age;
    private double avGrade;

    public Pupils(String name, int age, double avGrade) {
        this.name = name;
        this.age = age;
        this.avGrade = avGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvGrade() {
        return avGrade;
    }

    public void setAvGrade(double avGrade) {
        this.avGrade = avGrade;
    }

    @Override
    public String toString() {
        return "Pupils{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", avGrade=" + avGrade +
                '}';
    }

    void study(){
        System.out.println("Учусь в универе или школе");
    }
}
