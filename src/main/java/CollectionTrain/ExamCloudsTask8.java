package CollectionTrain;

//Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
//Создать коллекцию, содержащую объекты класса Student.
//Написать метод, который удаляет студентов со средним баллом <3.
//Если средний балл>=3, студент переводится на следующий курс.
//Напишите метод printStudents(List<Student> students, int course), который получает список студентов и номер курса.
//А также печатает на консоль имена тех студентов из списка, которые обучаются на данном курсе.

import java.util.ArrayList;
import java.util.List;

public class ExamCloudsTask8 {
    public static void main(String[] args) {
        List<Students> AllStudents = new ArrayList<>();

        Students st1 = new Students("Саша", 364, 3, 4, 5, 4);
        Students st2 = new Students("Петя", 264, 2, 2, 3, 3);
        Students st3 = new Students("Вася", 564, 5, 5, 5, 5);
        Students st4 = new Students("Виола", 164, 1, 5, 3, 3);
        Students st5 = new Students("Света", 364, 3, 5, 4, 5);
        Students st6 = new Students("Луиза", 264, 2, 3, 5, 5);
        AllStudents.add(st1);
        AllStudents.add(st2);
        AllStudents.add(st3);
        AllStudents.add(st4);
        AllStudents.add(st5);
        AllStudents.add(st6);

        st1.StudentsIsLessThan3(AllStudents);



    }



    static class Students{
        String name;
        int group;
        int course;
        int mathScore;
        int russScore;
        int englishScore;

        public Students(String name, int group, int course, int mathScore, int russScore, int englishScore) {
            this.name = name;
            this.group = group;
            this.course = course;
            this.mathScore = mathScore;
            this.russScore = russScore;
            this.englishScore = englishScore;

        }

        public void StudentsIsLessThan3(List<Students> s){

            for(Students st: s){
                float  avarageScore;
                avarageScore = ((mathScore + russScore + englishScore)/3);
                if(avarageScore<3){
            }else{
                    System.out.println(st);
                }

            }

//            float avarageScore;
//            avarageScore = (mathScore + russScore + englishScore)/3;
//            if (avarageScore<3){
//            }else {
//                System.out.println("Средняя оценка " + avarageScore);
//            }

        }


        @Override
        public String toString() {
            return "Students{" +
                    "name='" + name + '\'' +
                    ", group=" + group +
                    ", course=" + course +
                    ", mathScore=" + mathScore +
                    ", russScore=" + russScore +
                    ", englishScore=" + englishScore +
                    '}';
        }
    }
}
