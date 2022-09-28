import java.util.Arrays;



//public class problem13 {
//    public int solution(int[][] sizes) {
//        int biggerSideMax = 0;
//        int smallerSideMax = 0;
////iter
//        for (int[] size : sizes) {
//            int currentBiggerSide = Math.max(size[0],size[1]);
//            int currentSmallerSide = Math.min(size[0],size[1]);
//            if(biggerSideMax < currentBiggerSide){
//                biggerSideMax = currentBiggerSide;
//            }
//            if(smallerSideMax < currentSmallerSide){
//                smallerSideMax = currentSmallerSide;
//            }
//        }
//
//        System.out.println(biggerSideMax*smallerSideMax);
//        return biggerSideMax * smallerSideMax;
//    }
//}



//{60,50}, {30,70}, {60,30},{80,40}}
//round 1 : big : 60 , small : 50
// round 2 : big : 70 , small : 50
// round 3 : big : 70 , small :50
// round 4 : big : 80 , small : 40

public class problem13 {
    public int solution(int[][] sizes) {
        int biggerSideMax = 0;
        int smallerSideMax =0;
        for (int[] size : sizes) {
            if(size[0]> size[1]) {
                if (biggerSideMax < Math.max(biggerSideMax, size[0])) {
                    biggerSideMax = size[0];
                }
                if (smallerSideMax < Math.max(smallerSideMax, size[1])) {
                    smallerSideMax = size[1];
                }
            }
            else{
                if(biggerSideMax < Math.max(biggerSideMax, size[1])){
                    biggerSideMax= size[1];
                }
                if(smallerSideMax < Math.max(smallerSideMax, size[0])){
                    smallerSideMax = size[0];
                }
            }
        }
        System.out.println(smallerSideMax*biggerSideMax);
        return smallerSideMax*biggerSideMax;

    }
}



//{60,50}, {100,100}, {60,30},{80,40}}
// round 1 : big : 60 , small : 50
// round 2 : big : 100 , small : 100
// round 3 : big : 70 , small : 50
// round 4 : big : 80 , small : 50
//public class problem13 {
//    public int solution(int[][] sizes) {
//        int biggerSideMax = 0;
//        int smallerSideMax = 0;
//        for (int[] size : sizes) {
//            if (size[0] > size[1]) {
//                if (biggerSideMax < size[0]) {
//                    biggerSideMax = size[0];
//                }
//                if (smallerSideMax < size[1]) {
//                    smallerSideMax = size[1];
//                }
//            }
//           else {
//                if (biggerSideMax < size[1]) {
//                    biggerSideMax = size[1];
//                }
//                if (smallerSideMax < size[0]) {
//                    smallerSideMax = size[0];
//                }
//            }
//        }
//        System.out.println(smallerSideMax * biggerSideMax);
//        return smallerSideMax * biggerSideMax;
//    }
//}


//public class problem13 {
//    public int solution(int[][] sizes) {
//        int biggerSideMax = 0;
//        int smallerSideMax = 0;
////iter
//        for (int[] size : sizes) {
//            if(size[0]>size[1]){
//                if(biggerSideMax < size[0]){
//                    biggerSideMax = size[0];
//                }
//                if(smallerSideMax < size[1]){
//                    smallerSideMax = size[1];
//                }
//            }else{
//                if(biggerSideMax < size[1]){
//                    biggerSideMax = size[1];
//                }
//                if(smallerSideMax < size[0]){
//                    smallerSideMax = size[0];
//                }
//            }
//        }
//        System.out.println(biggerSideMax*smallerSideMax);
//        return biggerSideMax * smallerSideMax;
//    }
//}

