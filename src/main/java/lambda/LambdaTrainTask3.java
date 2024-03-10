package lambda;
import java.util.function.Predicate;
//Написать программу, которая проверяет, что строка начинается буквой “J”или “N” и заканчивается “A”.
//Используем функциональный интерфейс Predicate.
public class LambdaTrainTask3 {
    public static void main(String[] args) {
        Predicate<String> checkString = x -> {return (x.startsWith("J")||x.startsWith("N"))&& x.endsWith("A");};
        System.out.println(checkString.test("JULIA")); //true
        System.out.println(checkString.test("LENA")); //false
    }


}
