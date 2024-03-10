package Interview;

public class Lamba extends Auto {

    public Lamba(String name, int horse_power) {
        super(name, horse_power);
    }
@Override
    public void voice (){
        System.out.println("Рычит");
    }

    @Override
    public String toString() {
        return "Lamba{}";
    }
}
