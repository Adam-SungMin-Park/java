import java.util.ArrayList;

public class problem25 {
    public int solution(int left, int right) {
        int answer = 0;
        int count =0;
        ArrayList<Integer> numArr = new ArrayList<Integer>();
        for(int i = left; i<= right; i++){
            numArr.add(i);
        }
        for(int i = 0 ; i < numArr.size(); i++){
            for(int j = 1; j<=numArr.get(i); j++ ){
                if(numArr.get(i)%j == 0){
                    System.out.println("divisor check for : "+numArr.get(i));
                    count++;
                }
            }
            if(count%2 ==0){
                answer += numArr.get(i);
            }
            else{
                answer -= numArr.get(i);
            }
            count = 0;
        }
        return answer;
    }
}





//
//class Solution {
//    public int solution(int left, int right) {
//        int answer = 0;
//
//        for (int i=left;i<=right;i++) {
//            //제곱수인 경우 약수의 개수가 홀수
//            if (i % Math.sqrt(i) == 0) {
//                answer -= i;
//            }
//            //제곱수가 아닌 경우 약수의 개수가 짝수
//            else {
//                answer += i;
//            }
//        }
//
//        return answer;
//    }
//}