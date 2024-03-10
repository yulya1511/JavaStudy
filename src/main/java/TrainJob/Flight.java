package TrainJob;

import java.util.ArrayList;

public class Flight {

    private String number_of_flight;
    private ArrayList<PassengerAvia> passengerAvias;

    public Flight(String number_of_flight) {
        this.number_of_flight = number_of_flight;
        this.passengerAvias = new ArrayList<>();
    }

    public String getNumber_of_flight() {
        return number_of_flight;
    }

    public void setNumber_of_flight(String number_of_flight) {
        this.number_of_flight = number_of_flight;
    }

    public ArrayList<PassengerAvia> getPassengerAvias() {
        return passengerAvias;
    }

    public void setPassengerAvias(ArrayList<PassengerAvia> passengerAvias) {
        this.passengerAvias = passengerAvias;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "number_of_flight='" + number_of_flight + '\'' +
                ", passengerAvias=" + passengerAvias +
                '}';
    }

    void  addPaxToFlight(PassengerAvia p){
        passengerAvias.add(p);
    }
}
