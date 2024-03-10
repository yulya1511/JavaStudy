package Interview;

public class Tsikles {
    public static void main(String[] args) {

        int x = 10, y = 10;
        int z = 13 - x--;
        int a = 13 - --y;

        System.out.println(z);
        System.out.println(a);
        System.out.println(x);
        System.out.println(y);

        String s = "2255";
        int i = Integer.parseInt(s);
        System.out.println(i);

        Integer d = 8255;
        String s2 = d.toString();
        System.out.println(s2);

//        for(int i=0; i<10;i++){
//            System.out.print(i + " ");
//        }
//        System.out.println(" ");
////        for(int i=0; i<10;i++){
////            for ( int j=0; j<3; j++){
////                System.out.println(i + " " + j);
////            }
////
////        }
//
////        for(int i=0; i<10;i++){
////            if(i==8){
////                continue;
////            }
////            System.out.println(i);
////        }
//
//        int s = 7;
//        do{
//            System.out.println(s);
//            s--;
//        }
//        while (s>2);
//
//        System.out.println(" ");
//
//        int f = 5;
//        while ( f>2){
//            System.out.println(f);
//            f--;
//        }
//
//
//        int d = 6;
//        while (d<12) {
//            if (d==10) {
//                continue;
//            }
//            System.out.println(d);
//            d++;
//        }
//        System.out.println("*******");

        String s3 = "4568";
        int i3 = Integer.parseInt(s3);
        System.out.println(i3);

        Integer i4 = 345;
        String s4 = i4.toString();
        System.out.println(s4);


    }


}
