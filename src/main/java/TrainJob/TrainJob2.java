package TrainJob;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainJob2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(3);
        list.add(7);
        list.add(6);
        list.add(2);

//        list.stream().forEach(e-> System.out.println(e));
//        System.out.println("--------------");
//       for(Integer i: list){
//           if (!(i%2==0)){
//               System.out.println(i);
//           }
//
//       }
        System.out.println("--------------");
       List<Integer>list1 =  list.stream().filter(s->s%2==0).collect(Collectors.toList());
        System.out.println(list1);



    }
}
