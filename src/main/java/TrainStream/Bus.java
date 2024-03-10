package TrainStream;

import java.util.ArrayList;
import java.util.List;

public class Bus {
     private List<Passenger> passengers;

    public Bus() {
        this.passengers = new ArrayList<>();
    }

    public List<Passenger> getPassangers() {
        return passengers;
    }

    public void setPassangers(List<Passenger> passangers) {
        this.passengers = passangers;
    }


    public void addPassToBus (Passenger p){
        passengers.add(p);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "passangers=" + passengers +
                '}';
    }
}
