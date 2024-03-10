package lesson1;

public class Main {
    public static void main(String[] args) {

//         res(4.4f, 3.4f, 2.5f, 2.1f);





        System.out.println("About me"); // первое задание
        byte age = 15; // второе задание
//        System.out.println("Мой возраст: " + age);
        short weight = 20;
//        System.out.println("Мой вес: " + weight);
        int height = 170;
//        System.out.println("Мой рост: " + height);
        long iphone = 14;
//        System.out.println("Телефон: " + iphone);
        float waist = 64.5f;
//        System.out.println("Размер талии: " + waist);
        double macVersion = 10.13;
//        System.out.println("Версия мака: " + macVersion);
        char ch = '&';
//        System.out.println("Some symbol: " + ch);
        String universuty = "СпбГУГА";
//        System.out.println(universuty);
        System.out.print("Мой возраст: " + age + "\nМой вес: " + weight + "\nМой рост: " + height + "\nТелефон: " + iphone + "\nРазмер талии: " + waist + "\n");
        System.out.println(res(4.4f, 3.4f, 2.5f, 2.1f));
    }
//
//        float a = 5.0f, b = 6.0f, c = 7.0f, d = 8.0f; /* третье задание?не понимаю что тут делать с return,
//        что и куда он возвращает, резудьтат на консоль вывела */
//        float result = a * (b + (c / d));
//        System.out.println(result);

//    }
//    public static boolean between10and20 (int x, int y) { // четвертое задание
//    int summ = x + y;
//    return summ >= 10 && summ <= 20;
//    }
//
//    public static void positiveOrNegative(int x) { // пятое задание
//        if (x >= 0) {
//            System.out.println("Положительное");
//        } else {
//            System.out.println("Отрицательное");
//        }
//
//        }
//
        public static float res (float a, float b, float c, float d){
        float result = a*(b+(c/d));
        return result;
        }

    }









