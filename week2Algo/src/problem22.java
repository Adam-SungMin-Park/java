import java.util.ArrayList;

public class problem22 {
    public int solution(String s){
        String lowerS = s.toLowerCase();
        String ansStr = lowerS.replace("one","1").replace("two","2").replace("three","3")
                .replace("four","4").replace("five","5").replace("six","6")
                .replace("seven","7").replace("eight","8").replace("nine","9").replace("zero","0");
        int ansInt = Integer.parseInt(ansStr);
        return ansInt;
    }
}




//
//class Solution {
//    public int solution(String s) {
//        int answer = 0;
//        StringBuilder sb = new StringBuilder("");
//        int len = s.length();
//        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
//        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};
//
//        for(int i=0; i<10; i++){
//            s = s.replaceAll(alphabets[i],digits[i]);
//        }
//
//        return Integer.parseInt(s);
//    }
//}