import java.util.*;

public class problem7 {
    public int[] solution(long n) {
        int[] answer = {};
        List<Integer> test = new ArrayList<Integer>();
        while(n > 0){
            test.add((int) (n%10));
            n = n/10;
        }

        int[] arr = test.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
