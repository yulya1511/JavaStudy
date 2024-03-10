package streamOfStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Train carriage1 = new Train("Детский");
        Train carriage2 = new Train("Взрослый");
        Train carriage3 = new Train("Пенсионеры");

        ArrayList<Train> trainList = new ArrayList<>();
        trainList.add(carriage1);
        trainList.add(carriage2);
        trainList.add(carriage3);


        Passenger passenger1 = new Passenger("Аля", 27);
        Passenger passenger2 = new Passenger("Лена", 24);
        Passenger passenger3 = new Passenger("Женя", 35);
        Passenger passenger4 = new Passenger("Ира", 55);
        Passenger passenger5 = new Passenger("Вика", 45);
        Passenger passenger6 = new Passenger("Иван", 15);
        Passenger passenger7 = new Passenger("Дима", 7);
        Passenger passenger8 = new Passenger("Елизавета", 29);
        Passenger passenger9 = new Passenger("Василиса", 64);


        List<Passenger> passengerList = new ArrayList<>();
        passengerList.add(passenger1);
        passengerList.add(passenger2);
        passengerList.add(passenger3);
        passengerList.add(passenger4);
        passengerList.add(passenger5);
        passengerList.add(passenger6);
        passengerList.add(passenger7);
        passengerList.add(passenger8);
        passengerList.add(passenger9);

        carriage1.addPaxToCarriage(passenger6);
        carriage1.addPaxToCarriage(passenger7);

        carriage2.addPaxToCarriage(passenger1);
        carriage2.addPaxToCarriage(passenger2);
        carriage2.addPaxToCarriage(passenger3);
        carriage2.addPaxToCarriage(passenger8);

        carriage3.addPaxToCarriage(passenger4);
        carriage3.addPaxToCarriage(passenger5);
        carriage3.addPaxToCarriage(passenger9);

        trainList.stream().flatMap(e -> e.getPassengerList().stream()).map(e -> e.getName()).forEach(e -> System.out.println(e));

        trainList.stream().flatMap(e -> e.getPassengerList().stream())
                .sorted(Collections.reverseOrder((e, x) -> e.getAge() - x.getAge())).forEach(e -> System.out.println(e));

        int summOfAge = trainList.stream().flatMap(e -> e.getPassengerList().stream()).mapToInt(e -> e.getAge()).sum();
        System.out.println(summOfAge);

        trainList.stream().flatMap(e -> e.getPassengerList().stream())
                .filter(e -> e.getName().startsWith("А") || e.getName().startsWith("Е")).forEach(e -> System.out.println(e));

        Map<Boolean, List<Passenger>> map = trainList.stream().flatMap(e -> e.getPassengerList()
                .stream()).collect(Collectors.partitioningBy(e -> e.getAge() > 30));
        for (Map.Entry<Boolean, List<Passenger>> myMap : map.entrySet()) {
            System.out.println(myMap.getKey() + " : " + myMap.getValue());
        }


    }
}
