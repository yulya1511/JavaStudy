package CollectionTrain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExamCloudsTask6 {
    public static void main(String[] args) {

        HeavyBoxTask6 box1 = new HeavyBoxTask6("20 футов", 200);
        HeavyBoxTask6 box2 = new HeavyBoxTask6("40 футов", 400);
        HeavyBoxTask6 box3 = new HeavyBoxTask6("45 футов", 550);
        HeavyBoxTask6 box4 = new HeavyBoxTask6("фридж", 350);
        HeavyBoxTask6 box5 = new HeavyBoxTask6("лонг", 280);

        ArrayList<HeavyBoxTask6> boxes = new ArrayList<>();
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
        boxes.add(box4);
        boxes.add(box5);

        Map<Boolean, List<HeavyBoxTask6>> sortedBoxes = boxes
                .stream().collect(Collectors.partitioningBy(e->e.weight>300));

        for(Map.Entry<Boolean, List<HeavyBoxTask6>> entry: sortedBoxes.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}



