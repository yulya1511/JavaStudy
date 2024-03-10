package Interface;

public class Contest {
     private Activable[] activable;
     private Passable[] passable;

    public Contest(Activable[] activable, Passable[] passable) {
        this.activable = activable;
        this.passable = passable;
    }

    public void startContest (){
        for (Activable a:this.activable){

            for(Passable p:this.passable){
                if (!a.isActive()){
                    continue;// ПОЧИТАТЬ ПРО ЭТО (ПЕРЕХОД К СЛЕД ИТЕРАЦИИ
                }
                p.pass(a);
            }
        }
    }
}
