import java.util.ArrayList;

public class problem21 {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
       for(int i = 0 ; i < nums.length-2 ; i ++){
           for(int j = i+1; j < nums.length-1; j++){
               for (int k = j+1 ; k < nums.length; k++){
                   list.add(nums[i]+nums[j]+nums[k]);
               }
           }
       }
        for (Integer integer : list) {
            int divisor = 2;
            while(integer > divisor){
                if(integer % divisor==0){
                    answer--;
                    break;
                }
                divisor++;
            }
            answer++;
        }

        return answer;
    }
}

