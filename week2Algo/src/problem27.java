import java.util.ArrayList;
import java.util.Collections;

public class problem27 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        ArrayList<Integer> wishList = new ArrayList<Integer>();
        for (int i : d) {
            wishList.add(i);
        }
        Collections.sort(wishList);
        for(int i = 0 ; i < wishList.size(); i++) {
            if (wishList.get(i) > budget) {
                break;
            } else {
                budget -= wishList.get(i);
                answer++;
            }
        }
        return answer;
    }
}
