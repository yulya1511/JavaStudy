package Enum;

//Создать перечисление, содержащее названия времен года.
//Создать переменную содержащую ваше любимое время года и распечатать всю информацию о нем.
//Создать метод, который принимает на вход переменную созданного вами enum типа. Если значение равно Лето,
// выводим на консоль “Я люблю лето” и так далее. Используем оператор switch.
//Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
//Добавить конструктор принимающий на вход среднюю температуру.
//Создать метод getDescription, возвращающий строку “Холодное время года”. Переопределить метод getDescription -
// для константы Лето метод должен возвращать “Теплое время года”.
//В цикле распечатать все времена года, среднюю температуру и описание времени года.
public class SeasonsEnum {

    public static void main(String[] args) {
        Seasons seasons = Seasons.AUTUMN;
        System.out.println("My fav season is " + seasons); //второй блок

        aboutSeasons(Seasons.AUTUMN);

        System.out.println( Seasons.SUMMER + " is " + Seasons.SUMMER.getDescription());

        System.out.println("-------");


        for(Seasons s: Seasons.values()){
            System.out.println(s + " " + s.getDescription() +  " " + s.getAvTemp());
        }





    }

    public static void aboutSeasons(Seasons seasons) { // третий блок
        switch (seasons) {
            case SUMMER:
                System.out.println("Люблю лето в Питере");
                break;
            case WINTER:
                System.out.println("Обожаю зиму за горнолыжку и новый год");
                break;
            case AUTUMN:
                System.out.println("Люблю осень за краски");
                break;
            case SPRING:
                System.out.println("Не люблю весну");
                break;
        }
    }




}


enum Seasons {
    SUMMER(23.5){        // первый блок
        @Override
        public  String getDescription (){
            return " is warm season"; // переопределили метод для лета
        }
    },
    AUTUMN(15.5),
    WINTER(-5.0),
    SPRING(10.5);

    private double avTemp; // добавляем переменную с температурой
    private Seasons (double avTemp){
        this.avTemp = avTemp;
    }

    public double getAvTemp(){
        return avTemp;


    }

    public String getDescription (){
        return " is cold season";
    }


}
