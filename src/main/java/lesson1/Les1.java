package lesson1;

public class Les1 {
    public static void main(String[] args) {

        String s1 = "2";
        int s2 = Integer.parseInt(s1);
        System.out.println(s2);

        myproject(26, "Юля");
        myproject(4, "Степа");

        int [] myArray = {5, 2, 4, 8, 7};
        boolean total = checkArray(myArray);
        System.out.println(total);

        int [] myArray2 = {2, 2, 2, 1, 2, 2, 10, 1};
        boolean total2 = checkArray(myArray2);
        System.out.println(total2);
    }

    public static void myproject (int counter, String name) {

        for (int i = 0; i < counter; i++){
            System.out.println(counter);
        }

    }

    public static boolean checkArray (int [] arr) {
        int summ = 0;
        for (int i = 0; i < arr.length; i++){
            summ += arr [i];

        }
        int left = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            left += arr [i];
            summ -= arr [i];
            if (left == summ) {
                return true;
            }
        }
        return false;
    }

    public static void myProject (int [] arr2, int n) {
        int index;
        for (int i = 0; i < arr2.length -1 ; i++){
            index = arr2 [i + 1];
            arr2 [i] = index;

        }





    }
}
