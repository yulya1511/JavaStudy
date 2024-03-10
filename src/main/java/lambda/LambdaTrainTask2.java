package lambda;

//Создать лямбда выражение, которое возвращает значение true, если строка не null, используя функциональный интерфейс Predicate.
//Создать лямбда выражение, которое проверяет, что строка не пуста, используя функциональный интерфейс Predicate.
//Написать программу проверяющую, что строка не null и не пуста, используя метод and() функционального интерфейса Predicate.

import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaTrainTask2 {

    public static void main(String[] args) {
        LambdaTrainTask2 lambdaTrainTask2 = new LambdaTrainTask2();
        Predicate<String> checkLine = x -> x != null;
        System.out.println(checkLine.test("Привет")); // 1е задание
        Predicate<String> isEmpty = x -> !x.isEmpty();
        System.out.println(isEmpty.test("Hello world")); // 2е задание
        System.out.println(checkLine.and(isEmpty).test("Приветики")); // 3е задание

        Predicate<Integer> checkInt = x1 -> x1==5;
        System.out.println(checkInt.test(8));

        Predicate<Integer> sum = x2 -> x2>9;
        System.out.println(sum.test(7));

      Summable summable;
      summable = (x,y) -> x+y;
        System.out.println(summable.summ1(2,3));

        System.out.println(lambdaTrainTask2.count(2,5));

    }

    public int count(int x1, int y1){
        return x1*y1;
    }
}

interface Summable{
    int summ1(int x, int y);
}
