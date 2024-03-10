package CollectionTrain;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayMethods2 {
    public static void main(String[] args) {
        Student st1 = new Student("Миша",25,5);
        Student st2 = new Student("Степа",24,4);
        Student st3 = new Student("Ваня",20,1);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        System.out.println(studentList);
        Student st4 = new Student("Ваня",20,1);
//        studentList.remove(st4);
        int index = studentList.indexOf(st4);
        System.out.println(index);

    }
}

class Student{
    private String name;
    private int age;
    private int course;

    public Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                course == student.course &&
                Objects.equals(name, student.name);
    }

}
