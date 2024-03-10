package Local;

import java.util.Locale;

public class LocalTrain {
    public static void main(String[] args) {
        Locale rus = new Locale("rus", "RUS");

        Locale current = Locale.getDefault();
        Info(rus);


    }

    public static void Info (Locale current){
        System.out.println("Код региона " + current.getCountry());
        System.out.println("Название региона " + current.getDisplayCountry());
        System.out.println("Код языка региона " + current.getLanguage());
        System.out.println("Название языка региона " + current.getDisplayLanguage());
        System.out.println();
    }
}
