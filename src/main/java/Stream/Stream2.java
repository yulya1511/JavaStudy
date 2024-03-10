package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 'm', 22, 3, 7.3);
        Student st2 = new Student("Misha", 'm', 21, 2, 9.3);
        Student st3 = new Student("Stepa", 'm', 19, 1, 8);
        Student st4 = new Student("Push", 'm', 28, 5, 7.8);
        Student st5 = new Student("Lena", 'f', 24, 4, 9);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        // поставить капс на имена
        // отфильтровать по полу
        // отсортировать по возрасту
        // вывести на экран

      students.stream().map(e -> {
          e.setName(e.getName().toUpperCase());
          return e;
      })
              .filter(e -> e.getSex()== 'm')
              .sorted((x,y) -> x.getAge() - y.getAge())
              .forEach(e -> System.out.println(e));


//        students = students.stream().filter(s -> s.getAge()>20 && s.getAvGrade()>7).collect(Collectors.toList());
//        students.forEach(s -> System.out.println(s)); //можно через форич для наглядности
//        System.out.println(students); // а можно и просто
//
//        System.out.println("---");
//
//        Stream<Student> stream = Stream.of(st1, st2, st3, st4, st5);
//        stream.filter(s3 -> s3.getAge()>20 && s3.getAvGrade()>7).collect(Collectors.toList());
//        System.out.println(stream); // можем создать отдельным стрим, но лучше не надо, создаем из коллекций


    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avGrade;

    public Student(String name, char sex, int age, int course, double avGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avGrade = avGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avGrade=" + avGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvGrade() {
        return avGrade;
    }

    public void setAvGrade(double avGrade) {
        this.avGrade = avGrade;
    }
}

