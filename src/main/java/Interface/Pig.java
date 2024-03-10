package Interface;

public class Pig implements Activable {

    private int stamina = 5;
    private boolean active = true;


    @Override
    public void run() {
        stamina-=2;
        if (stamina>=0){
            System.out.println("Свинья бежит");
        }else{
            System.out.println("Свинья не бежит");
            this.active = false;
        }
    }

    @Override
    public void jump() {
        stamina -= 3;
        if (stamina >= 0) {
            System.out.println("Свинья прыгает");
        } else {
            System.out.println("Свинья не прыгает");
            this.active = false;
        }
    }

    @Override
    public boolean isActive() {
        return active;
    }
}
