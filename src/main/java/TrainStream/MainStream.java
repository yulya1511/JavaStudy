package TrainStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainStream {
    public static void main(String[] args) {
        Passenger p1 = new Passenger("Юля", 26);
        Passenger p2 = new Passenger("Лена", 23);
        Passenger p3 = new Passenger("Степа", 28);
        Passenger p4 = new Passenger("Ира", 55);
        Passenger p5 = new Passenger("Григорий", 45);
        Passenger p6 = new Passenger("Витя", 35); // ПЕРВОЕ ЗАДАНИЕ создаем еще 2 паксов
        Passenger p7 = new Passenger("Дима", 30);

        List <Passenger> passengers = new ArrayList<>();
        passengers.add(p1);
        passengers.add(p2);
        passengers.add(p3);
        passengers.add(p4);
        passengers.add(p5);

        Bus bus1 = new Bus();
        Bus bus2 = new Bus(); // ВТОРОЕ ЗАДАНИЕ создали 2 автобуса

        bus1.addPassToBus(p1);
        bus1.addPassToBus(p2);
        bus1.addPassToBus(p3);
        bus1.addPassToBus(p4);
        bus2.addPassToBus(p5);
        bus2.addPassToBus(p6);
        bus2.addPassToBus(p7); //  ВТОРОЕ ЗАДАНИЕ: добавляем паксов в автобусы через метод, который создали в классе Bus

        List <Bus> buses = new ArrayList<>(); // ТРЕТЬЕ ЗАДАНИЕ создали лист с автобусами
        buses.add(bus1);
        buses.add(bus2);

        buses.forEach(b-> System.out.println(b)); //  ЧЕТВЕРТОЕ ЗАДАНИЕ выводим на экран автобусы с паксами(через форич для наглядности)

        System.out.println("-----");

        buses.stream().flatMap(b -> b.getPassangers().stream()).forEach(e-> System.out.println(e)); // 5 задание вытаскиваем всех паксов на консоль

        System.out.println("-----");

        Map<Integer, List<Passenger>> mapAge = passengers.stream().collect(Collectors.groupingBy(e->e.getAge()));
        for (Map.Entry<Integer, List<Passenger>> entry: mapAge.entrySet()){
            System.out.println("Возраст " + entry.getKey() + " лет (года) :" + entry.getValue().toString()); // 5 задание выводит ключ возвраст, значение сам пакс
        }

        System.out.println("-----");

        Map<Boolean, List<Passenger>> mapDifferenceAge = passengers.stream().collect(Collectors.partitioningBy(e->e.getAge()>30));
        for(Map.Entry<Boolean, List<Passenger>> entry : mapDifferenceAge.entrySet()){
            System.out.println(entry.getKey() + entry.getValue().toString()); // 6 задание
        }

        System.out.println(" ");

        double avAgeOfPax = passengers.stream().mapToDouble(e->e.getAge()).average().getAsDouble();
        System.out.println("Средний возраст пассажиров: " + avAgeOfPax + " лет(года)"); // 7 задание



















//        List<Passenger> passAgeLess30 = passengers.stream().filter(e->e.getAge()<30).collect(Collectors.toList());
//        System.out.println(passAgeLess30);
//        passAgeLess30 = passAgeLess30.stream().filter(e->e.getName().length()<=4).limit(1).collect(Collectors.toList());
//        System.out.println(passAgeLess30);

//        List<String> passName = passengers.stream().map(e->e.getName()).collect(Collectors.toList());
//        System.out.println(passName);
//
//        List<String> passFiltr = passName.stream().sorted((e,e1) -> e.compareTo(e1)).collect(Collectors.toList());
//        System.out.println(passFiltr);


    }
}
