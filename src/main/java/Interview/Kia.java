package Interview;

public class Kia extends Auto {

    String color;

    public Kia(String name, int horse_power, String color) {
        super(name, horse_power);
        this.color = color;
    }

    @Override
    public void voice (){
        System.out.println("Звук не издает");
    }

    @Override
    public String toString() {
        return "Kia{" +
                "color='" + color + '\'' +
                '}';
    }
}
