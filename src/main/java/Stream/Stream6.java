package Stream;

import lambda.Student;

import java.util.ArrayList;
import java.util.List;

public class Stream6 {

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 7.3);
        Student st2 = new Student("Misha", 'm', 21, 2, 9.3);
        Student st3 = new Student("Stepa", 'm', 19, 1, 8);
        Student st4 = new Student("Push", 'm', 28, 5, 7.8);
        Student st5 = new Student("Lena", 'f', 24, 4, 9);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Math");

        f1.addStOnFac(st1);
        f1.addStOnFac(st2);
        f1.addStOnFac(st3);
        f2.addStOnFac(st4);
        f2.addStOnFac(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        //нам нужно вывести имена всех студентов всех факультетов

        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream()).forEach(e -> System.out.println(e));
    }
}

class Faculty{
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public  void addStOnFac (Student s) {
        studentsOnFaculty.add(s);
    }
}
