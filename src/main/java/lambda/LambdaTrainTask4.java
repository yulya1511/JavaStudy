package lambda;

import CollectionTrain.ExamCloudsTask1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

//Написать лямбда выражение, которое принимает на вход объект типа HeavyBox и выводит на консоль сообщение
//“Отгрузили ящик с весом n”.
//“Отправляем ящик с весом n” Используем функциональный интерфейс Consumer и метод по умолчанию andThen.

public class LambdaTrainTask4 {
    public static void main(String[] args) {
        HeavyBox box1 = new HeavyBox("20-футовый контейнер", 3900);
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

        arrayOfBox.forEach(s -> System.out.println(s));// инфо на консоль с помощью форич

        System.out.println("------"); //пробел для наглядности

        Consumer<HeavyBox> getHeavyBox = s -> System.out.println("Отгрузили " + s.nameOfBox + " с весом " + s.weight);
        getHeavyBox.accept(box1);
        getHeavyBox.accept(box2);
        getHeavyBox.accept(box3);
        getHeavyBox.accept(box4);
        getHeavyBox.accept(box5); // первое задание выводим на консоль предложение

        System.out.println("------"); //пробел для наглядности

        Consumer<HeavyBox> sendHeavyBox = s -> System.out.println("Отправляем  " + s.nameOfBox + " с весом " + s.weight);
        getHeavyBox.andThen(sendHeavyBox).accept(box1);
        System.out.println("");
        getHeavyBox.andThen(sendHeavyBox).accept(box2);
        System.out.println("");
        getHeavyBox.andThen(sendHeavyBox).accept(box3);
        System.out.println("");
        getHeavyBox.andThen(sendHeavyBox).accept(box4);
        System.out.println("");
        getHeavyBox.andThen(sendHeavyBox).accept(box5); // отгрузили и отправляем контейнеры
        System.out.println("");


    }


}

class HeavyBox {
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
