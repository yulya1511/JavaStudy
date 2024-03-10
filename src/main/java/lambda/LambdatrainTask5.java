package lambda;

import java.util.Scanner;
import java.util.function.Function;

//Написать лямбда выражение, которое принимает на вход число и возвращает значение “Положительное число”,
//“Отрицательное число” или  “Ноль”. Используем функциональный интерфейс Function.
public class LambdatrainTask5 {
    public static void main(String[] args) {

//        Function<Integer, String> f1 = f -> String.format("положительное число");
//        System.out.println(f1.apply(30));
//
//        Function<Integer, String> f2 = f -> String.format("отрицательное число");
//        System.out.println(f2.apply(-45));
//
//
//        Function<Integer, String> f3 = f -> String.format("ноль");
//        System.out.println(f3.apply(0));

        ComparableStrings result = (s1, s2) -> {
            if (s1.length() > s2.length()) {
                return s1;
            } else {
                return s2;
            }
        };

        System.out.println(result.compare("Юля", "Женя"));
    }

    interface ComparableStrings {
        String compare(String s1, String s2);
    }
}
