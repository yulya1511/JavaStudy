package MyTrain;

public class StringBuilderTrain {

    public static void main(String[] args) {

        StringBuilder spb = new StringBuilder("Аэропорт");
        char c = spb.charAt(2);
        System.out.println(c); //получает индекс

        StringBuilder msc = new StringBuilder("Сыктывкар");
        msc.setCharAt(2, 'в');
        String result = msc.toString();
        System.out.println(result);
        //System.out.println(msc.toString());

        StringBuilder ekb = new StringBuilder("Кольцово");
        int startIndex = 1;
        int endIndex = 4;
        char [] kol = new char[endIndex-startIndex];
        ekb.getChars(startIndex, endIndex, kol, 0);
        System.out.println(kol);

        StringBuilder syk = new StringBuilder("Сыктывкар");
        syk.append(" помойка");
        System.out.println(syk.toString());

        StringBuilder komi = new StringBuilder("Сыктывкар");
        komi.insert(3, ' ');
        System.out.println(komi.toString());

        StringBuilder led = new StringBuilder("Сыктывкар");
        led.delete(3,9);
        System.out.println(led.toString());
        led.deleteCharAt(2);
        System.out.println(led.toString());

        StringBuilder asf = new StringBuilder("Астрахань");
        String s1 = asf.substring(0,5);
        System.out.println(s1);

        StringBuilder train = new StringBuilder("Ноутбук");
        train.setLength(4);
        System.out.println(train.toString());

        StringBuilder train1 = new StringBuilder("Ноутбук");
        train1.replace(0,4,"Мак");
        System.out.println(train1.toString());
        train1.reverse();
        System.out.println(train1.toString());

        System.out.println("*******************");

        StringBuilder st1 = new StringBuilder("Привет");
        st1.reverse();
        System.out.println(st1.toString());







    }
}
