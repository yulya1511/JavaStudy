package TrainJob;

import java.util.*;
import java.util.stream.Collectors;

public class MainPupil {
    public static void main(String[] args) {

        Pupil p1 = new Pupil("Yulia", 8,5.0);
        Pupil p2 = new Pupil("Lena", 7,4.0);
        Pupil p3 = new Pupil("Dima", 8,3.0);
        Pupil p4 = new Pupil("Kolya", 8,3.5);
        Pupil p5 = new Pupil("Vasya", 9,4.4);
        Pupil p6 = new Pupil("Nika", 9,3.8);
        Pupil p7 = new Pupil("Polina", 9,3.3);
        Pupil p8 = new Pupil("Natasha", 7,5.0);
        Pupil p9 = new Pupil("Leya", 8,4.9);
        Pupil p10 = new Pupil("Bika", 8,4.3);
        Pupil p11 = new Pupil("Vera", 9,4.7);
        Pupil p12 = new Pupil("Bona", 9,4.0);
        Pupil p13 = new Pupil("Sara", 8,3.4);
        Pupil p14 = new Pupil("Volodya", 8,5.0);
        Pupil p15 = new Pupil("Jesika", 7,4.0);

        List<Pupil> pupils = new ArrayList<>();
        pupils.add(p1);
        pupils.add(p2);
        pupils.add(p3);
        pupils.add(p4);
        pupils.add(p5);
        pupils.add(p6);
        pupils.add(p7);
        pupils.add(p8);
        pupils.add(p9);
        pupils.add(p10);
        pupils.add(p11);
        pupils.add(p12);
        pupils.add(p13);
        pupils.add(p14);
        pupils.add(p15);

        ClassesOfSchool firstClass = new ClassesOfSchool();
        ClassesOfSchool secondClass = new ClassesOfSchool();
        ClassesOfSchool thirdClass = new ClassesOfSchool();

        firstClass.addToClasses(p2);
        firstClass.addToClasses(p8);
        firstClass.addToClasses(p15);
        secondClass.addToClasses(p1);
        secondClass.addToClasses(p3);
        secondClass.addToClasses(p4);
        secondClass.addToClasses(p9);
        secondClass.addToClasses(p10);
        secondClass.addToClasses(p13);
        secondClass.addToClasses(p14);
        thirdClass.addToClasses(p5);
        thirdClass.addToClasses(p6);
        thirdClass.addToClasses(p7);
        thirdClass.addToClasses(p11);
        thirdClass.addToClasses(p12);

        List<ClassesOfSchool> classesOfSchools = new ArrayList<>();
        classesOfSchools.add(firstClass);
        classesOfSchools.add(secondClass);
        classesOfSchools.add(thirdClass);

        classesOfSchools.forEach(e-> System.out.println(e));

        System.out.println("*******");

        classesOfSchools.stream().flatMap(e -> e.pupils.stream()).forEach(e-> System.out.println(e));

        System.out.println("*******");

        classesOfSchools.stream().flatMap(e->e.pupils.stream()).filter(e->e.age==7)
        .sorted().forEach(e-> System.out.println(e));

        System.out.println("*******");

        classesOfSchools.stream().flatMap(e->e.pupils.stream()).sorted()
    .forEach(e-> System.out.println(e));

        System.out.println("*******");

        Map<Integer, List<Pupil>> mapPupil =
        classesOfSchools.stream().flatMap(e->e.pupils.stream()).collect(Collectors.groupingBy(e->e.age));
        for(Map.Entry<Integer, List<Pupil>> entry: mapPupil.entrySet()){
            System.out.println("Age " + entry.getKey() + " : " + entry.getValue().toString());
        }
        System.out.println("*******");
        Map<Boolean, List<Pupil>> mapPupil2 =
                classesOfSchools.stream().flatMap(e->e.pupils.stream()).collect(Collectors.partitioningBy(e->e.age==7));
        for (Map.Entry<Boolean, List<Pupil>> entry: mapPupil2.entrySet()){
            System.out.println(entry.getKey() + entry.getValue().toString());
        }
        System.out.println("*******");
        Map<Double, List<Pupil>> mapPupiL3 =
                classesOfSchools.stream().flatMap(e->e.pupils.stream()).collect(Collectors.groupingBy(e->e.avGrade));
        for(Map.Entry<Double, List<Pupil>> entry: mapPupiL3.entrySet()){
            System.out.println("Average grade " + entry.getKey() + " : " + entry.getValue().toString());
        }
        System.out.println("*******");
        double avAge = classesOfSchools.stream().flatMap(e->e.pupils.stream()).mapToDouble(e->e.age).average().getAsDouble();
        System.out.println(avAge);

        double avGrade = classesOfSchools.stream().flatMap(e->e.pupils.stream()).mapToDouble(e->e.avGrade).average().getAsDouble();
        System.out.println(avGrade);
        System.out.println("*******");
        classesOfSchools.stream().flatMap(e->e.pupils.stream().map(e1->e1.name)).forEach(s-> System.out.println(s));

        p1.competition();


    }
}

class Pupil implements Comparable <Pupil>{

    String name;
    int age;
    double avGrade;

    public Pupil(String name, int age, double avGrade) {
        this.name = name;
        this.age = age;
        this.avGrade = avGrade;
    }

    void competition (){
        if (age>=8){
            System.out.println(name + " cтудент(ка) прошел по возрасту");
        }else {
            System.out.println( name + " студент(ка) не прошел возрасту");

        }
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", avGrade=" + avGrade +
                '}';
    }


    @Override
    public int compareTo(Pupil pupil) {
        return this.age - pupil.age;
    }

}

class ClassesOfSchool {
    List<Pupil> pupils;

    public ClassesOfSchool() {
        this.pupils = new ArrayList<>();
    }

    void addToClasses (Pupil pupil){
        pupils.add(pupil);
    }


    @Override
    public String toString() {
        return "ClassesOfSchool{" +
                "pupils=" + pupils +
                '}';
    }
}




