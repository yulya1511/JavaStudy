package Oop;

public class Girls extends Friends {
    private int beauty;
    private String kind_of_sport;
    private String title;


    public Girls(String name, int age, int salary, int beauty, String kind_of_sport, String title) {
        super(name, age, salary);
        this.beauty = beauty;
        this.kind_of_sport = kind_of_sport;
        this.title = title;

    }

    public int getBeauty (){
        return beauty;
    }
    public String getKind_of_sport  (){
        return kind_of_sport;
    }
    public String getTitle  (){
        return title;
    }
    public void setBeauty (int beauty){
        this.beauty = beauty;
    }
    public void setKind_of_sport (String kind_of_sport){
        this.kind_of_sport = kind_of_sport;
    }
    public void setTitle (String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return "Girls{" +
                "beauty=" + beauty +
                ", kind_of_sport='" + kind_of_sport + '\'' +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", desire='" + this.getDesire() + '\'' +
                '}';
    }
//    @Override
//    public String toString() {
//        return "Girls{" +
//                "beauty=" + beauty +
//                ", kind_of_sport='" + kind_of_sport + '\'' +
//                ", title='" + title + '\'' +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", salary=" + salary +
//                '}';
//    }

}


