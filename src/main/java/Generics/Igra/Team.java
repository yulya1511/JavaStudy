package Generics.Igra;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Particapant> {

    private String name;
    private List <T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNewParticipant (T particapant){
        participants.add(particapant);
        System.out.println("В команду " + name + " был добавлен участник по имени " + particapant.getName());
    }

    public void playWith (Team<T> team){
        String winner;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0){
            winner = this.name;
        }else {
            winner = team.name;
        }
        System.out.println("Выйграла комнада " + winner);

    }
}
