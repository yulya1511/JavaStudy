package lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StudentInfo1 {

    public static void main(String[] args) {
        Student1 st1 = new Student1("Kolya", 20, 2, 7.0);
        Student1 st2 = new Student1("Misha", 24, 5, 9.0);
        Student1 st3 = new Student1("Anya", 21, 3, 8.3);
        Student1 st4 = new Student1("Lena", 19, 1, 8.5);
        Student1 st5 = new Student1("Julia", 23, 4, 8.8);

        ArrayList <Student1> students1 = new ArrayList<>();
        students1.add(st1);
        students1.add(st2);
        students1.add(st3);
        students1.add(st4);
        students1.add(st5);

        StudentInfo1 studentInfo1 = new StudentInfo1();

        students1.forEach(student1 -> System.out.println(students1));
        System.out.println("----------------");
//       overAge(students1, 22);
//        System.out.println("----------------");
        testStudents1(students1, s -> s.age>23);
        System.out.println("----------------");
        testStudents1(students1, p ->p.avGrade<8.5);




    }

//public static void overAge (ArrayList<Student1> arrayList, int age){
//        for (Student1 st: arrayList){
//            if (st.age>age){
//                System.out.println(st);
//            }
//        }
//}

public static  void testStudents1 (ArrayList<Student1> arrayList, Predicate<Student1> predicate){
        for(Student1 student1: arrayList){
            if(predicate.test(student1)){
                System.out.println(student1);
            }
        }

}

}
