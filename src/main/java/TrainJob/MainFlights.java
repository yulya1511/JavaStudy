package TrainJob;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainFlights {
    public static void main(String[] args) {

        PassengerAvia p1 = new PassengerAvia("Yuliya", "Glikhikh", 27, "Gold");
        PassengerAvia p2 = new PassengerAvia("Elena", "Glikhikh", 27, "Silver");
        PassengerAvia p3 = new PassengerAvia("Irina", "Glikhikh", 58, "Gold");
        PassengerAvia p4 = new PassengerAvia("Stepan", "Kotov", 25, "Bronze");
        PassengerAvia p5 = new PassengerAvia("Zhenya", "Glikhikh", 36, "Gold");

        ArrayList<PassengerAvia> passengerAvias = new ArrayList<>();
        passengerAvias.add(p1);
        passengerAvias.add(p2);
        passengerAvias.add(p3);
        passengerAvias.add(p4);
        passengerAvias.add(p5);

        Flight flight1 =new Flight("SU032");
        Flight flight2 =new Flight("FV6028");

        flight1.addPaxToFlight(p1);
        flight1.addPaxToFlight(p2);
        flight1.addPaxToFlight(p4);
        flight2.addPaxToFlight(p3);
        flight2.addPaxToFlight(p5);

        ArrayList<Flight> flights = new ArrayList<>();
        flights.add(flight1);
        flights.add(flight2);

        flights.stream().forEach(s-> System.out.println(s));
        System.out.println("--------------------------------");
        flights.stream().flatMap(e->e.getPassengerAvias().stream()).forEach(s -> System.out.println(s));
        System.out.println("--------------------------------");
        flights.stream().flatMap(e->e.getPassengerAvias().stream())
                .map(e -> {if(e.getStatus()== "Gold"){
                    e.setStatus(e.getStatus().toUpperCase());
                }
            return e;
                }).forEach(e -> System.out.println(e));
        System.out.println("--------------------------------");

        passengerAvias.stream().sorted((x,y) -> x.getAge()-y.getAge()).forEach(e-> System.out.println(e));
        System.out.println("--------------------------------");
        flights.stream().flatMap(e->e.getPassengerAvias().stream()).sorted((x,y)->x.getStatus().compareTo(y.getStatus()))
                .forEach(e-> System.out.println(e));
        System.out.println("--------------------------------");
        passengerAvias.stream().filter(e->e.getAge()>30).forEach(e-> System.out.println(e));
        System.out.println("--------------------------------");
        passengerAvias.stream().filter(e->e.getStatus()=="GOLD" && e.getAge()>25).forEach(e-> System.out.println(e));
        System.out.println("--------------------------------");
        PassengerAvia min = passengerAvias.stream().min((x,y) -> x.getAge()-y.getAge()).get();
        System.out.println(min);
        PassengerAvia max = passengerAvias.stream().max((x,y) -> x.getAge()-y.getAge()).get();
        System.out.println(max);
        System.out.println("--------------------------------");
        flights.stream().flatMap(e->e.getPassengerAvias().stream()).sorted((x,y)->x.getAge()-y.getAge())
                .filter(e->e.getAge()>=27)
                .limit(2)
                .forEach(e-> System.out.println(e));
        System.out.println("--------------------------------");
        Map<Object, List<PassengerAvia>> map1 = flights.stream().flatMap(e->e.getPassengerAvias().stream())
                .collect(Collectors.groupingBy(e->e.getStatus()));
        for(Map.Entry<Object, List<PassengerAvia>> entry: map1.entrySet()){
            System.out.println("Статус: " + entry.getKey() + entry.getValue());

        }
        System.out.println("--------------------------------");

        double avAge = flights.stream().flatMap(e->e.getPassengerAvias().stream())
                .mapToDouble(e->e.getAge())
                .average()
                .getAsDouble();
        System.out.println(avAge);











    }
}
