package Error;

// Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
// При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
// Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//3 В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
// и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).

import java.util.zip.DataFormatException;

public class ExceptionsExamples {
    public static void main(String[] args) {

        String[][] myStringArray = {
                {"5", "3", "7","8"},
                {"4", "5", "6", "1"},
                {"5", "3", "19", "1"},
                {"7", "9", "5", "22"}
        };
        try{
            myArrMethod (myStringArray);
        }catch (MyArraySizeException e) {
            e.printStackTrace();
        }catch (MyArrayDataException ed){
            ed.printStackTrace();
        }

    }

    public static void myArrMethod (String[][] myArr) throws MyArraySizeException, MyArrayDataException{
        if(myArr.length>4||myArr.length<4){
           throw new MyArraySizeException ("Размер коробки не соответствует!");
        }else if (myArr[0].length>4||myArr[0].length<4){
            throw new MyArraySizeException("Размер коробки не соответствует!");
        }else {
            System.out.println("Все верно коробка нужного размера");
        }

        int result = 0;
        for(int i=0 ;i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                try {
                    result += Integer.parseInt(myArr[i][j]);
                }catch (NumberFormatException e1){
                    e1.printStackTrace();
                    throw new MyArrayDataException(String.format("В ячейке [%d][%d] лежит не число!!!", i, j));
                }
            }
        }
        System.out.println(result);

    }

}
