import java.util.ArrayList;
import java.util.List;

public class problem29 {
    public int solution(int n) {
        List<Integer> remainderOne = new ArrayList<Integer>();
        for(int i = 1; i < n ; i ++ ){
            if(n%i == 1){
                remainderOne.add(i);
            }
        }
        int min = Integer.MAX_VALUE;

        for (Integer integer : remainderOne) {
            min = Math.min(min, integer);
        }

        System.out.println(min);



        return min;
    }
}
