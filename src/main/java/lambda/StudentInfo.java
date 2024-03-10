package lambda;

import java.util.ArrayList;

public class StudentInfo {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 7.3);
        Student st2 = new Student("Misha", 'm', 21, 2, 9.3);
        Student st3 = new Student("Stepa", 'm', 19, 1, 8);
        Student st4 = new Student("Push", 'm', 28, 5, 7.8);
        Student st5 = new Student("Lena", 'f', 24, 4, 9);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        for (Student st: students){
            System.out.println(st);
        }
        System.out.println("------------");

        StudentInfo info =  new StudentInfo ();
        info.testStudents(students,  new checkOverGrade()); // первый метод с оверрайдом
        System.out.println("------------");
        info.testStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return s.age<30;
            }
        });
        System.out.println("------------");
        info.testStudents(students, (Student s) -> {return s.age<30;});
        System.out.println("------------");
        info.testStudents(students,  s ->  s.age<30);
        System.out.println("------------");
        info.testStudents(students, (Student s) ->  s.age<30);
        System.out.println("------------");
        info.testStudents(students,  s-> {return s.age<30;});
        System.out.println("------------");
        info.testStudents(students,  s -> {
            System.out.println("Hello");
            return s.age<30;});

//        info.printStudentOverGrade(students, 8);
//        System.out.println("------------");
//        info.printStudentUnderAge(students, 22);
//        System.out.println("------------");
//        info.printStudentMixCondition(students, 20, 8, 'm');
    }
    void testStudents (ArrayList <Student> al , StudentChecks sc) {
        for(Student s: al) {
            if(sc.check(s)) {
                System.out.println(s);
            }
        }
    }

    interface StudentChecks {
        boolean check(Student s);
    }
     static class checkOverGrade implements StudentChecks { //можно не создавать класс и неимплементировать интерфейс если использовать лямбду
         @Override
         public boolean check(Student s) {
             return s.avGrade > 8;
         }
     }
        //    void printStudentOverGrade (ArrayList <Student> al, double grade){
//        for (Student s: al){
//            if(s.avGrade>grade){
//                System.out.println(s);
//            }
//        }
//
//    }
//    void printStudentUnderAge (ArrayList <Student> al, int age){
//        for (Student s: al){
//            if(s.age>age){
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentMixCondition (ArrayList <Student> al, int age, double grade, char sex){
//        for (Student s: al){
//            if(s.avGrade<grade && s.age>age && s.sex==sex){
//                System.out.println(s);
//            }
//        }

}
