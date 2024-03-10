package lambda;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class AnimalsInfo {
    public static void main(String[] args) {

        Animals animals1 = new Animals("Sherlock", "cat", 4, 10.5);
        Animals animals2 = new Animals("Sherlock", "dog", 4, 10.5);
        Animals animals3 = new Animals("Leya", "cat", 7, 5.4);
        Animals animals4 = new Animals("Liya", "pig", 4, 8.2);
        Animals animals5 = new Animals("Dis", "cat", 9, 7.5);
        Animals animals6 = new Animals("Rock", "mouse", 15, 4.5);
        Animals animals7 = new Animals("Anita", "cat", 11, 6.8);
        Animals animals8 = new Animals("Helix", "mouse", 12, 2.1);
        Animals animals9 = new Animals("Jon", "parrot", 17, 9);
        Animals animals10 = new Animals("Fifa", "dog", 13, 3.9);

        ArrayList<Animals> animals = new ArrayList<>();
        animals.add(animals1);
        animals.add(animals2);
        animals.add(animals3);
        animals.add(animals4);
        animals.add(animals5);
        animals.add(animals6);
        animals.add(animals7);
        animals.add(animals8);
        animals.add(animals9);
        animals.add(animals10);

//        for (Animals an : animals) {
//            System.out.println(an);
//        }
//        System.out.println("---------");
        AnimalsInfo animalsInfo = new AnimalsInfo();
        animalsInfo.infoAnimals(animals, (Animals s) -> {
            return s.type == "cat" && s.age > 5;
        });
        System.out.println("---------");

        Informable informable = s -> System.out.println(s);
        informable.info("Наконец-то");
        System.out.println("---------");

        animals.forEach(an-> System.out.println(an)); // consumer
        System.out.println("---------");

        animalsInfo.infoAnimals1(animals, d->d.type=="cat"); // predicate





    }

    interface CheckAnimals {
        boolean check(Animals an1);
    }

    void infoAnimals(ArrayList<Animals> a, CheckAnimals ch) {
        for (Animals a1 : a) {
            if (ch.check(a1)) {
                System.out.println(a1);


            }
        }
    }

    interface Informable{
        void info (String s);
    }

    void infoAnimals1(ArrayList<Animals> a, Predicate <Animals>predicate) {
        for (Animals a1 : a) {
            if (predicate.test(a1)) {
                System.out.println(a1);


            }
        }
    }


}

