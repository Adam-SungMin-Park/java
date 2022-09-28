import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;


// 1,2,2,2,3,3,4 = > 1,2,2,3,4
public class problem14 {
    public int[] solution(int[] arr) {
    ArrayList<Integer> ans = new ArrayList<Integer>();
    int val = -1; // its only positive number so initialize with negative num.

        for( int i = 0 ; i < arr.length; i++){
            if(arr[i] != val){
                ans.add(arr[i]);
                val = arr[i];
            }
        }
        System.out.println(ans);
    int [] answer = ans.stream().mapToInt(i -> i).toArray();



   return answer;
    }

}
