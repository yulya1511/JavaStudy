package CollectionTrain;

//Создать динамический массив, содержащий объекты класса HeavyBox.
//Распечатать его содержимое используя for each.
// Изменить вес первого ящика на 1.
// Удалить последний ящик.
// Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
// Удалить все ящики.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExamCloudsTask1 {

    private static void main(String[] args) {
        HeavyBox box1 = new HeavyBox ("20-футовый контейнер", 3900);
        HeavyBox box2 = new HeavyBox("40-футовый контейнер", 5600);
        HeavyBox box3 = new HeavyBox("45-футовый контейнер", 5900);
        HeavyBox box4 = new HeavyBox("Авиа контейнер", 3600);
        HeavyBox box5 = new HeavyBox("Open контейнер", 3000);
        List<HeavyBox> arrayOfBox = new ArrayList<>();
        arrayOfBox.add(box1);
        arrayOfBox.add(box2);
        arrayOfBox.add(box3);
        arrayOfBox.add(box4);
        arrayOfBox.add(box5);

        for(HeavyBox boxes:arrayOfBox){
            System.out.println(boxes); //выводим в консоль с помощью цикла

        }
        System.out.println("\n");
        box1.weight = 1; // меняем вес первого ящика
        System.out.println(arrayOfBox);// печаетаем результат в консоль с изменением веса
        arrayOfBox.remove(box5);//уаляем последний ящик
        System.out.println(arrayOfBox);//выводим результат в консоль без последнего ящика
        System.out.println("\n");

        HeavyBox[] arrayOfBoxes1 = {box1, box2, box3, box4, box5}; //первый способ получения массива (Выводит, что 5 ящик не удален)
            System.out.println(Arrays.toString(arrayOfBoxes1));
        System.out.println("\n");

            HeavyBox [] arrayOfBoxes2 = arrayOfBox.toArray(new HeavyBox[5]);//второй способ. Уже выводит с удаленным ящиком.
        System.out.println(Arrays.toString(arrayOfBoxes2));
        System.out.println("\n");

        HeavyBox[] arrayOfBoxes3 = arrayOfBox.toArray(new HeavyBox[]{box1, box2, box3, box4, box5});
        System.out.println(Arrays.toString(arrayOfBoxes3)); //3й способ, выводит удаленный ящик как null
        System.out.println("\n");

        arrayOfBox.clear();
        System.out.println(arrayOfBox);

    }

    static class HeavyBox{
        String nameOfBox;
        int weight;

        public HeavyBox(String nameOfBox, int weight) {
            this.nameOfBox = nameOfBox;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "HeavyBox{" +
                    "nameOfBox='" + nameOfBox + '\'' +
                    ", weight=" + weight +
                    '}';
        }
    }
}
