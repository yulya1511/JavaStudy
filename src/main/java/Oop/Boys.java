package Oop;

public class Boys extends Friends{
    private String car_brand;
    private int flat_rent;
    private int haircut;

    public Boys(String name, int age, int salary,String car_brand, int flat_rent, int haircut) {
        super(name, age, salary);
        this.car_brand = car_brand;
        this.flat_rent = flat_rent;
        this.haircut = haircut;
        }

        public String getCar_brand(){
        return car_brand;
        }
        public int getFlat_rent (){
        return flat_rent;
        }
        public int getHaircut (){
        return haircut;
        }
        public void setCar_brand (String car_brand){
        this.car_brand = car_brand;
        }
        public void setFlat_rent (int flat_rent){
        this.flat_rent = flat_rent;
        }
        public void setHaircut (int haircut){
        this.haircut = haircut;
        }

    @Override
    public String toString() {
        return "Boys{" +
                "car_brand='" + car_brand + '\'' +
                ", flat_rent=" + flat_rent +
                ", haircut=" + haircut +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", desire='" + this.getDesire() + '\'' +
                '}';
    }
}







//
//    @Override
//    public String toString() {
//        return "Boys{" +
//                "car_brand='" + car_brand + '\'' +
//                ", flat_rent=" + flat_rent +
//                ", haircut=" + haircut +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", salary=" + salary +
//                '}';
//    }



