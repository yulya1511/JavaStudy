package Interview;

public class AutoMain {
    public static void main(String[] args) {

        Auto auto1 = new Kia("Picanto", 80, "cherry" );
        Auto auto2 = new Lamba("Huracan", 500);

        AutoRepair autoRepair = new AutoRepair();

        auto1.voice();
        auto2.voice();

        autoRepair.repair(auto1);
        autoRepair.repair(auto2);

    }
}
