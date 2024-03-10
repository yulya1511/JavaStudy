package CollectionTrain;

/*Создать TreeSet содержащий HeavyBox.
HeavyBox должен реализовать интерфейс Comparable.
Распечатать содержимое с помощью for each.*/

import java.util.Collections;
import java.util.TreeSet;

public class ExamCloudsTask2 {

    public static void main(String[] args) {

        HeavyBox2 box1 = new HeavyBox2("20-футовый контейнер", 3900);
        HeavyBox2 box2 = new HeavyBox2("40-футовый контейнер", 5600);
        HeavyBox2 box3 = new HeavyBox2("45-футовый контейнер", 5900);
        HeavyBox2 box4 = new HeavyBox2("Авиа контейнер", 3600);
        HeavyBox2 box5 = new HeavyBox2("Open контейнер", 3000);

        TreeSet<HeavyBox2> MyBoxes = new TreeSet<>();
        MyBoxes.add(box1);
        MyBoxes.add(box2);
        MyBoxes.add(box3);
        MyBoxes.add(box4);
        MyBoxes.add(box5);

        System.out.println("Отсортировали по весу: ");
        for (HeavyBox2 b : MyBoxes) {
            System.out.println(b);
        }
        System.out.println("-------");

        System.out.println(MyBoxes);


    }

    static class HeavyBox2 implements Comparable<HeavyBox2> {
        String nameOfBox;
        int weight;

        public HeavyBox2(String nameOfBox, int weight) {
            this.nameOfBox = nameOfBox;
            this.weight = weight;

        }

        @Override
        public String toString() {
            return "HeavyBox2{" +
                    "nameOfBox='" + nameOfBox + '\'' +
                    ", weight=" + weight +
                    '}';
        }


        @Override
        public int compareTo(HeavyBox2 heavyBox2) {
            return this.weight - heavyBox2.weight;
        }

//        @Override // так можем сортануть по нейму
//        public int compareTo(HeavyBox2 heavyBox3) {
//            return this.nameOfBox.compareTo(heavyBox3.nameOfBox);
//        }
    }
}

