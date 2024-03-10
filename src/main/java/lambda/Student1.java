package lambda;

public class Student1 {

    String name;
    int age;
    int course;
    double avGrade;

    public Student1(String name, int age, int course, double avGrade) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.avGrade = avGrade;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", avGrade=" + avGrade +
                '}';
    }
}
