package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream7 {

    public static void main(String[] args) {
        Student1 st1 = new Student1("Ivan", 'm', 22, 3, 7.3);
        Student1 st2 = new Student1("Misha", 'm', 21, 1, 9.3);
        Student1 st3 = new Student1("Stepa", 'm', 19, 1, 8);
        Student1 st4 = new Student1("Push", 'm', 28, 5, 7.8);
        Student1 st5 = new Student1("Lena", 'f', 24, 4, 9);

        ArrayList<Student1> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Map<Integer, List<Student1>> map = students.stream().map(e -> {
            e.name.toLowerCase();
            return e;
        })
                .collect(Collectors.groupingBy(e -> e.course));
        for (Map.Entry<Integer, List<Student1>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().toString());
        }
        System.out.println("-----");


        Map<Boolean, List<Student1>> map1 = students.stream(). collect(Collectors.partitioningBy(e -> e.avGrade>8));
        for (Map.Entry<Boolean, List<Student1>> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().toString());
        }

    }
}


 class Student1 {
    String name;
    char sex;
    int age;
    int course;
    double avGrade;

    public Student1 (String name, char sex, int age, int course, double avGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avGrade = avGrade;
    }

    @Override
    public String toString() {
        return "Student1 {" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avGrade=" + avGrade +
                '}';
    }
}
