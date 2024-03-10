package lambda;

import CollectionTrain.ExamCloudsTask2;

import java.util.Objects;

public class Animals implements Comparable<Animals>{
    String name;
    String type;
    int age;
    double weight;

    public Animals(String name, String type, int age, double weight) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.weight = weight;


    }


    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Animals animals) {
        return this.age-animals.age;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Animals animals = (Animals) o;
//        return age == animals.age &&
//                Double.compare(animals.weight, weight) == 0 &&
//                Objects.equals(name, animals.name) &&
//                Objects.equals(type, animals.type);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, type, age, weight);
//    }


}
