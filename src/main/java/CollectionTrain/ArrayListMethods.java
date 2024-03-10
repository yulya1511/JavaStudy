package CollectionTrain;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Yulya");
        arrayList1.add("Lena");
        arrayList1.add("Zhenya");
        arrayList1.add(1, "Stepan");
        for(String s: arrayList1){
            System.out.print(s + " ");
        }
        System.out.println();

//        for (int i = 0;i<arrayList1.size();i++)
//        System.out.println(arrayList1.get(i));
        arrayList1.set(1,"Push");

        arrayList1.remove(0);
        arrayList1.remove("Lena");
        System.out.println(arrayList1);
    }
}
