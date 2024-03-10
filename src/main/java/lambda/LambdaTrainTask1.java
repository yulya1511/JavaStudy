package lambda;
//Написать лямбда выражение для интерфейса Printable, который содержит один метод void print().

public class LambdaTrainTask1 {
    public static void main(String[] args) {
        Printable printable;
        printable = () -> System.out.println("Привет всем");
        printable.print();
    }

    interface Printable{
        void print();
        }
    }


