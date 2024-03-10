package CollectionTrain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListMethods5 {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Yulya");
        arrayList1.add("Lena");
        arrayList1.add("Zhenya");

        System.out.println(arrayList1);
        Object [] array = arrayList1.toArray();
        String [] array1 = arrayList1.toArray(new String[3]);

        for(String s:array1){
            System.out.println(s);
        }
//        List<String> myList = arrayList1.subList(0,1);
//        System.out.println(myList);

//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("Yulya");
//        arrayList2.add("Lena");

//        arrayList1.retainAll(arrayList2);
//        System.out.println(arrayList1);

//        boolean result = arrayList1.containsAll(arrayList2);
//        System.out.println(result);

    }
}
