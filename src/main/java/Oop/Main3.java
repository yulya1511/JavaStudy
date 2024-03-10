package Oop;

public class Main3 {
    public static void main(String[] args) {


        Girls bestFriend = new Girls("Nataly", 24, 70000, 5500, "Skating", "КМС");
        Girls sister = new Girls("Lena", 26, 80000, 7500, "gymnastics", "МС");
        bestFriend.setDesire("wanna buy a new car");
        sister.setDesire("wanna travel more than now");
        System.out.println(bestFriend);
        System.out.println(sister);
        System.out.println(bestFriend.getKind_of_sport());
        bestFriend.setKind_of_sport(" ТЕПЕРЬ ГИМНАСТИКА");
        System.out.println(bestFriend.getKind_of_sport());



        Boys boyfriend = new Boys("Stepan", 24, 120000, "Mazda", 10000, 1500);
        Boys friend = new Boys("Yura", 25, 100000, "Не имеет машины", 45000, 1200);
        boyfriend.setDesire("wanna apply for a job in FlyDubai");
        friend.setDesire("wanna move in Europe");
        System.out.println(boyfriend);
        System.out.println(friend);


    }
}
