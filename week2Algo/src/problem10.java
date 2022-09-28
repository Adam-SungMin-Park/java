import java.util.*;
import java.util.stream.Collector;

public class problem10 {
    public int[] solution(int[] arr) {
        //{1,99,0,2,3,11}
        if(arr.length==1){
           return new int[]{-1};
       }
        int [] ans = new int[arr.length-1];

        int min = arr[0]; // min =1 ;
        for(int i = 0; i < arr.length; i ++){
            min = Math.min(min, arr[i]); // Math.min(1, 1) ==> 1 round 2: Math.min(1, 99) ==> 1
                                        // round 3: Math.min(1, 0) ==> 0
        }                               //
        int idx = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i]==min){ //1 == min == 1 continue; round 2 : arr[1] = 99 != 1 goes to line 21
                continue;    // round 3: arr[2] == 0 == min continue

            }
            ans[idx++] = arr[i]; // ans[0] = arr[1] == 99,
        }
       return ans;
    }
}

//
//class Solution {
//    public int[] solution(int[] arr) {
//        if (arr.length <= 1) return new int[]{ -1 };
//        int min = Arrays.stream(arr).min().getAsInt();
//        return Arrays.stream(arr).filter(i -> i != min).toArray();
//    }
//}

//class Solution {
//    public int[] solution(int[] arr) {
//        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
//        Arrays.sort(arr);
//        list.remove(list.indexOf(arr[0]));
//        if (list.size() <= 0) return new int[]{-1};
//        return list.stream().mapToInt(i->i).toArray();
//    }
//}