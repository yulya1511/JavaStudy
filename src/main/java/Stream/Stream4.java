package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stream4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int res = list.stream().reduce((accumulator, element) -> accumulator*element).get(); //если есть элементы вызываем GET
        System.out.println(res); // 5*8=40  40*2 и тд

        int res2 = list.stream().reduce(1, (accumulator, element) -> accumulator*element); //если ставим начальный аккумулятор то уже не получим значение НУЛ
        System.out.println(res); // 1*5, 5*8=40  40*2 и тд

        List<Integer> list1 = new ArrayList<>();
        Optional<Integer> o = list1.stream().reduce((accumulator, element) -> accumulator*element);
        if(o.isPresent()){
            System.out.println(o.get());
        }else {
            System.out.println("Not present");
        }
    }
}
