import java.util.*;

public class problem9 {
    public long solution(long n) {
        double test = (double) n;
        double squareAble = Math.sqrt(test);
        double floorAble = Math.floor(squareAble);
        double difference = squareAble - floorAble;
        if (difference == 0.0d) {
            double newSquare = squareAble + 1;
            double ans = newSquare * newSquare;
            return (long) ans;
        } else {
            return -1;
        }
    }
}
//class Solution {
//    public long solution(long n) {
//        if (Math.pow((int)Math.sqrt(n), 2) == n) {
//            return (long) Math.pow(Math.sqrt(n) + 1, 2);
//        }
//
//        return -1;
//    }
//}