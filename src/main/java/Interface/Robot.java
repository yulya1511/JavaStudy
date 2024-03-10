package Interface;

public class Robot implements Activable {

    private int stamina = 20;
    private boolean active = true;


    @Override
    public void run() {
        stamina-=1;
        if (stamina>=0){
            System.out.println("Робот бежит");
        }else{
            System.out.println("Робот не бежит");
            this.active = false;
        }
    }

    @Override
    public void jump() {
        stamina -= 1;
        if (stamina >= 0) {
            System.out.println("Робот прыгает");
        } else {
            System.out.println("Робот не прыгает");
            this.active = false;
        }
    }

    @Override
    public boolean isActive() {
        return active;
    }
}
