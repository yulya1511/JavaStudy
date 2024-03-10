package MyTrain;

public class StringTrain {
    public static void main(String[] args) {

        String a1 = "Мама";
        String a2 = "Папа";
        String a3 = "Любовь";
        String result = a1 + " " + a2 + " = " + a3;
        System.out.println(result); //простое сложение

        String в1 = "Люблю";
        String в2 = "Жизнь";
        в1 = в1.concat(в2);
        System.out.println(в1);
        в2 = в2.concat(в1);
        System.out.println(в2); //объеденение строк без учета разделителя

        String c1 = "Привет";
        String c2 = "Степа";
        String с3 = String.join(" ", c1, c2);
        System.out.println(String.join(" ", c1, c2));// объеденение строк с учетом разделителя!!!Почему переменную нельзя в sout вставить

        String d1 = "Авиация";
        char d = d1.charAt(4);
        System.out.println(d); //извлечение символа

//        String p1 = "Гражданская Авиация";
//        int start = 0;
//        int end = 11;
//        char[] dst = new char[end-start];
//        p1.getChars(start,end,dst,0);
//        System.out.println(dst); // извлечение подстроки

        String s1 = "Привет";
        String s2 = "привет";
        System.out.println(s1.equals(s2)); //сравнение с учетом регистра
        System.out.println(s1.equalsIgnoreCase(s2)); //сравнение без учета регистра

        String b1 = "Гражданская Авиация";
        int ind1 = b1.indexOf("жд");
        int ind2 = b1.lastIndexOf("а");
        System.out.println(ind1); //опред индекс первого вхождения подстроки в строку
        System.out.println(ind2); // посл индекс вхождения

        String job = "Pulkovo";
        boolean start = job.startsWith("Pu");
        boolean end = job.endsWith("v");
        System.out.println(start); //опред начинается ли строка с опред подстроки
        System.out.println(end); //заканчивается

        String n1 = "Гражданская Авиация";
        String n = n1.replace('а', '@');
        System.out.println(n);

        String l = "Гражданская Авиация";
        String l1 = l.substring(12);
        String l2 = l.substring(12,15);
        System.out.println(l1);
        System.out.println(l2);

        String P = "Гражданская Авиация";
        System.out.println(P.toLowerCase());
        System.out.println(P.toUpperCase());

        String text = "Университет Гражданской Авиации";
        String[]words = text.split(" ");
        for (String word: words){
            System.out.println(word);
        }







    }
}
