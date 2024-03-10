package Interview;

public class Auto {

    private String name;
    private int horse_power;

    public Auto(String name, int horse_power) {
        this.name = name;
        this.horse_power = horse_power;
    }

    public Auto() {
    }

    public void voice (){
        System.out.println("Издает звук ли");
    }



    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", horse_power=" + horse_power +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHorse_power() {
        return horse_power;
    }

    public void setHorse_power(int horse_power) {
        this.horse_power = horse_power;
    }
}
