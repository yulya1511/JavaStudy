package lambda;
import java.util.Random;
import  java.util.function.Supplier;
//Написать лямбда выражение, которое возвращает случайное число от 0 до 10.
//Используем функциональный интерфейс Supplier.
public class lambdaTrainTask6 {

    public static void main(String[] args) {
        Supplier<Integer> getNumber = () -> {
            Random r = new Random();
            int x = r.nextInt(10);
            return x;
            };
        System.out.println(getNumber.get());

    }
}
