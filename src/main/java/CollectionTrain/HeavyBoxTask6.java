package CollectionTrain;

import java.util.Objects;

public class HeavyBoxTask6 {
    String nameOfBox;
    int weight;

    public HeavyBoxTask6(String nameOfBox, int weight) {
        this.nameOfBox = nameOfBox;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBoxTask6{" +
                "nameOfBox='" + nameOfBox + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeavyBoxTask6 that = (HeavyBoxTask6) o;
        return weight == that.weight &&
                Objects.equals(nameOfBox, that.nameOfBox);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBox, weight);
    }
}
