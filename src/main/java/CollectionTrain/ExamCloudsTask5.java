package CollectionTrain;

//Создать очередь, содержащую объекты класса HeavyBox.
// Используем класс ArrayDeque.
// Поместить объекты в очередь с помощью метода offer().
// Удалить объекты методом poll().

import java.util.ArrayDeque;
import java.util.Deque;

public class ExamCloudsTask5 {
    public static void main(String[] args) {

        HeavyBox5 box1 = new HeavyBox5("20-футовый контейнер", 3900);
        HeavyBox5 box2 = new HeavyBox5("40-футовый контейнер", 5600);
        HeavyBox5 box3 = new HeavyBox5("45-футовый контейнер", 5900);
        HeavyBox5 box4 = new HeavyBox5("Авиа контейнер", 3600);
        HeavyBox5 box5 = new HeavyBox5("Open контейнер", 3000);

        Deque<HeavyBox5> BoxesInDeque = new ArrayDeque<>();
        BoxesInDeque.offer(box1);
        BoxesInDeque.offer(box3);
        BoxesInDeque.offer(box4);
        BoxesInDeque.offer(box2);
        BoxesInDeque.offer(box5);

        for(HeavyBox5 heavyBox5: BoxesInDeque) //тренируемся просто с добавлением в очередь
        System.out.println(heavyBox5);
        System.out.println("\n");

        Deque<HeavyBox5> BoxesInDeque1 = new ArrayDeque<>();// тренируемся с добавлением в очередь по First and Last
        BoxesInDeque1.offerFirst(box1);
        BoxesInDeque1.offerFirst(box3);
        BoxesInDeque1.offerLast(box4);
        BoxesInDeque1.offerFirst(box2);
        BoxesInDeque1.offerLast(box5);

        for(HeavyBox5 h: BoxesInDeque1)
            System.out.println(h);


    }

    static class HeavyBox5 {
        String nameOfBox;
        int weight;

        public HeavyBox5(String nameOfBox, int weight) {
            this.nameOfBox = nameOfBox;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "HeavyBox5{" +
                    "nameOfBox='" + nameOfBox + '\'' +
                    ", weight=" + weight +
                    '}';
        }
    }
}

