package TrainJob;

public class PassengerAvia {

    private String name;
    private String surname;
    private int age;
    private String status;

    public PassengerAvia(String name, String surname, int age, String status) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PassengerAvia{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", status='" + status + '\'' +
                '}';
    }


//    @Override
//    public int compareTo(PassengerAvia passengerAvia) {
//        if (passengerAvia.getStatus() == "Gold") {
//            return 1;
//        } else if (passengerAvia.getStatus() == "Silver") {
//            return 0;
//        } else{
//            return -1;
//        }
//    }
}
