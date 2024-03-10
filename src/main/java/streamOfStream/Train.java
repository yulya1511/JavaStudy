package streamOfStream;

import java.util.ArrayList;
import java.util.List;

public class Train {
    String name;
    private List<Passenger> passengerList;

    public Train(String name) {
        this.name = name;
        this.passengerList = new ArrayList<>();
    }

     void addPaxToCarriage(Passenger p){
        passengerList.add(p);
    }

    @Override
    public String toString() {
        return "Train{" +
                "name='" + name + '\'' +
                ", passengerList=" + passengerList +
                '}';
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }
}
