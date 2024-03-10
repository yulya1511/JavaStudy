package Interface;

public class Main {
    public static void main(String[] args) {

        Activable human = new Human();
        Activable pig = new Pig();
        Activable robot = new Robot();



//        human.jump();
//        human.run();
//
//        pig.jump();
//        pig.run();
//
//        robot.jump();
//        robot.run();

//        Passable treadmill = new TreadMill();
//        Passable wall = new Wall();
//
//        Passable treadmill1 = new TreadMill();
//        Passable wall1 = new Wall();
//
//        Passable treadmill2 = new TreadMill();
//        Passable wall2 = new Wall();
//
//        Passable treadmill3 = new TreadMill();
//        Passable wall3 = new Wall();
//
//        Passable treadmill4 = new TreadMill();
//        Passable wall4 = new Wall();

        Activable[] competitors = new Activable[3];
        competitors[0] = human;
        competitors[1] = pig;
        competitors[2] = robot;

        Passable[] competitions = new Passable[10];
        competitions[0] = new TreadMill();
        competitions[1] = new TreadMill();
        competitions[2] = new TreadMill();
        competitions[3] = new TreadMill();
        competitions[4] = new TreadMill();
        competitions[5] = new TreadMill();
        competitions[6] = new Wall();
        competitions[7] = new Wall();
        competitions[8] = new Wall();
        competitions[9] = new Wall();

        Contest contest = new Contest(competitors, competitions);

        contest.startContest();

//        for (Activable a:competitors){
//
//            for(Passable p:competitions){
//                p.pass(a);
//            }
//        }






//        treadmill.pass(human);
//        treadmill.pass(pig);
//        treadmill.pass(robot);
//
//        wall.pass(human);
//        wall.pass(pig);
//        wall.pass(robot);




    }
}
