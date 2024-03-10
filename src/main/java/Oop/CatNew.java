package Oop;

public class CatNew extends AnimalNew {

     static int count;


    public CatNew(String name) {
        super(name, 200, 0);
        count+=1;
    }


}
