package Enum;

import java.util.Arrays;

public class EnumTest {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.SATURDAY);
        System.out.print("Настроение в  " + today.weekDays + ":");
        today.daysInfo();

        WeekDays w1 = WeekDays.MONDAY;
        WeekDays w2 = WeekDays.MONDAY;
        System.out.println(w1==w2); // можем сравнивать ==

        WeekDays w15 = WeekDays.valueOf("MONDAY");
        System.out.println(w15);

        WeekDays[] array = WeekDays.values();
        System.out.println(Arrays.toString(array));

    }
}
enum WeekDays{
    MONDAY ("Огонь"),
    TUESDAY ("Кайф"),
    WEDNESDAY ("Хорошо"),
    THURSDAY("Прекрасно"),
    FRIDAY("Лучше всех"),
    SATURDAY("Балдеж"),
    SUNDAY("Чил");

    private String mood;
    private WeekDays (String mood){ // конструктор всегда прайвет, нельзя икстендить, не вызывается, поэтому new не пишем
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }

}



class Today{
    WeekDays weekDays;

    public Today (WeekDays weekDays){
        this.weekDays = weekDays;
    }

    void daysInfo(){
        switch (weekDays){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Иди на работу");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("WeekEnd");
                break;
        }

        System.out.println(weekDays.getMood());
    }
}
