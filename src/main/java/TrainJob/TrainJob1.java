package TrainJob;

import java.util.*;

public class TrainJob1 {

    public static void main(String[] args) {

//       //Напишите программу, которая выводит на экран числа от 1 до 10.
//
        for(int i = 1; i<11;i++){
            System.out.print(i + " ");
        }
//        //Напишите программу, которая находит сумму всех чисел от 1 до 100.
        System.out.println("");
        int summ = 0;
        for (int i = 1; i<=100; i++){
            summ += i;
        }
        System.out.println(summ);
//
//        //Найдите факториал заданного числа.
//
        int factorial = 5;
        for(int i = 1; i<5;i++){
           factorial *= i;
        }
        System.out.println(factorial); //первый способ
//
        int[] array = {1,2,3,4,5};
            int res = Arrays.stream(array).reduce((s, d) -> s * d).getAsInt();
            System.out.println(res); // второй способ
//
//         //Напишите проверку, является ли заданное число простым.
//
        int check = 8;
        int i;
        for (i = 2; i<check; i++){
            if (check%i == 0){
                System.out.println( check + " - число составное");
                break;
            }else {
                System.out.println(check + " - число простое");
                break;
            }
        }
//
//        //Отсортируйте массив по значению в порядке возрастания и убывания.
//
        int [] array1 = {5,6,2,7,8,3,9,45,68,34,89,114,1};
        array1 = Arrays.stream(array1).sorted().toArray();
        System.out.println(Arrays.toString(array1));

        Integer [] array2 = Arrays.stream(array1).boxed().toArray(Integer[]:: new);
        Arrays.sort(array2, Comparator.reverseOrder());
        System.out.println(Arrays.toString(array2));
        int x = Arrays.binarySearch(array2, 5);
        System.out.println(x);
//
//       //Напишите на Java простой код, который переводит целое число в строку,
//        // при том что его можно применить в любой системе счисления.
//
        int myNumber = 15;
        String s1 = String.format("%d",myNumber);
        System.out.println(s1);

        String s2 = "15";
        int myNumber2 = Integer.parseInt(s2);
        System.out.println(s2);

        //Отсортируйте словарь по значению в порядке возрастания и убывания. Объясните решение.


        Unknown person1 = new Unknown("Lena");
        Unknown person2 = new Unknown("Julia");
        Unknown person3 = new Unknown("Mam");
        Unknown person4 = new Unknown("Wolf");
        Unknown person5 = new Unknown("Hare");


        Map<Unknown, Integer> map1 = new HashMap<>();
        map1.put(person1, 25);
        map1.put(person2, 26);
        map1.put(person3, 58);
        map1.put(person4, 2);
        map1.put(person5, 43);

        map1.entrySet().stream()
                .sorted(Map.Entry. <Unknown, Integer> comparingByKey())
                .forEach(System.out::println);




    }
}

class Unknown implements Comparable <Unknown>{
    String name;

    public Unknown(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Unknown{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unknown unknown = (Unknown) o;
        return Objects.equals(name, unknown.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }



    @Override
    public int compareTo(Unknown unknown) {
        return this.name.compareTo(unknown.name);
    }
}
