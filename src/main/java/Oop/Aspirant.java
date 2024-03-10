package Oop;

public class Aspirant extends Student {

    public String science;


    public Aspirant(String first_name, String last_name, int group, double average_mark, String science) {
        super(first_name, last_name, group, average_mark);
        this.science = science;
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "science='" + science + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", group=" + group +
                ", average_mark=" + average_mark +
                '}';
    }

    @Override
    public void Salary() {
        if (average_mark == 5) {
            System.out.println("Стипендия = 2200");
        } else {
            System.out.println("Стипендия = 2000");
        }
    }
}
