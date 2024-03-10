package Oop;

public abstract class Friends {
    protected String name;
    protected int age;
    protected int salary;
    private String desire;

    public Friends(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

//    @Override
//    public String toString() {
//        return "Friends{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", salary=" + salary +
//                ", desire='" + desire + '\'' +
//                '}';
//    }

        public String getDesire (){
        return desire;
    }
    public void setDesire (String desire){
        this.desire = desire;
    }

    public void its_my_desire (){
    System.out.println("Its my desire: " + desire);
}

}
