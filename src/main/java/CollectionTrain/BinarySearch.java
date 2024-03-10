package CollectionTrain;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(-8);
        arrayList.add(16);
        arrayList.add(199);
        arrayList.add(54);
        arrayList.add(-35);
        arrayList.add(-333);
        arrayList.add(2);
        arrayList.add(88);
        arrayList.add(98);
        arrayList.add(-3895);
        Collections.sort(arrayList);
        int index = Collections.binarySearch(arrayList, 16);
        System.out.println(index);

    }
}
