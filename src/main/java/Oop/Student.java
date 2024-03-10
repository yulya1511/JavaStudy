package Oop;

public class Student {

    public String first_name;
    public String last_name;
    public int group;
    public double average_mark;

    public Student(String first_name, String last_name, int group, double average_mark) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.group = group;
        this.average_mark = average_mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", group='" + group + '\'' +
                ", average_mark=" + average_mark +
                '}';
    }

    public void Salary (){
        if (average_mark == 5){
            System.out.println("Стипендия = 2000");
        }else {
            System.out.println("Стипендия = 1900");
        }

    }
}
