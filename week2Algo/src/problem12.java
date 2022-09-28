import java.util.ArrayList;
import java.util.Arrays;

public class problem12 {
    public boolean solution(int x) {
        int og = x;
        boolean answer = true;
        int sum = 0;
        String str = "" + x;
        if (x % 10 == 0) {
            x = x / 10;
        }
        for (int i = 0; i < str.length(); i++) {
            sum = sum + x % 10;
            x /= 10;
        }
        if (og % sum == 0) {
            answer = true;
        }
        if (og % sum != 0) {
            answer = false;
        }

        return answer;
    }
}

//public class HarshadNumber {
//    public boolean isHarshad(int num) {
//
//        String[] temp = String.valueOf(num).split("");
//
//        int sum = 0;
//        for (String s : temp) {
//            sum += Integer.parseInt(s);
//        }
//
//        if (num % sum == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//}