import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class problem20 {
    public String solution(String s) {
        ArrayList<Character> upperList = new ArrayList<Character>();
        ArrayList<Character> lowerList = new ArrayList<Character>();

        for( int i = 0 ; i < s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                upperList.add(s.charAt(i));
            }
            if(Character.isLowerCase(s.charAt(i))){
                lowerList.add(s.charAt(i));
            }
        }
        lowerList.sort(Collections.reverseOrder());
        upperList.sort(Collections.reverseOrder());

        String newAns = "";
        for (Character character : lowerList) {
            newAns+=character;
        }
        for (Character character : upperList) {
            newAns += character;
        }

        return newAns;
    }
}




//public class ReverseStr {
//    public String reverseStr(String str){
//        char[] sol = str.toCharArray();
//        Arrays.sort(sol);
//        return new StringBuilder(new String(sol)).reverse().toString();
//    }
//
//    // 아래는 테스트로 출력해 보기 위한 코드입니다.
//    public static void main(String[] args) {
//        ReverseStr rs = new ReverseStr();
//        System.out.println( rs.reverseStr("Zbcdefg") );
//    }
//}