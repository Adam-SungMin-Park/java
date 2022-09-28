import java.lang.reflect.Array;
import java.util.*;

import static java.util.Collections.*;


public class problem8 {
    public long solution(long n) {
        //21942 => 94221
        String str = Long.toString(n); // long to string (for indexing)
        ArrayList<Character> test = new ArrayList<Character>(); // create new array list with char.
        for( int i = 0; i < str.length(); i++ ){
            test.add(str.charAt(i));
        } // fill in the array list with string values

        test.sort(Comparator.reverseOrder()); //sort the list
        String answer = ""; //make an empty string (to parse into long later on)
        for(int i = 0 ; i < test.size(); i++){
            answer += test.get(i);
        }
        Long realAnswer = Long.parseLong(answer); // parse to long
        System.out.println(realAnswer);

        return n;
    }
}

//public class ReverseInt {
//    String res = "";
//    public int reverseInt(int n){
//        res = "";
//        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
//        return Integer.parseInt(res);
//    }
//
//    // 아래는 테스트로 출력해 보기 위한 코드입니다.
//    public static void  main(String[] args){
//        ReverseInt ri = new ReverseInt();
//        System.out.println(ri.reverseInt(118372));
//    }
//}