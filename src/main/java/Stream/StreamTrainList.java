package Stream;

public class StreamTrainList {

    public static void main(String[] args) {


    }
}



class Family {
    String name;
    int age;
    char sex;
    long phone;
    String groupOfBlood;

    public Family(String name, int age, char sex, long phone, String groupOfBlood) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.groupOfBlood = groupOfBlood;
    }

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", phone=" + phone +
                ", groupOfBlood='" + groupOfBlood + '\'' +
                '}';
    }
}
