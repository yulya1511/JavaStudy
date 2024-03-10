package oopCat;

public class Plate1 {

    private int food;

    public Plate1(int food) {
        this.food = food;
    }

    public boolean getFoodFromPlate ( int countOfFood){
        if (this.food>countOfFood){
            this.food-=countOfFood;
            return true;
        }
        return false;
    }
    public void info (){
        System.out.println("Остаток еды: " + this.food);
    }
}
