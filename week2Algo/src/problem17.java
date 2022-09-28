import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class problem17 {
    public int[] solution(int[] lottos, int[] win_nums) {
        ArrayList<Integer> lotto = new ArrayList<Integer>();
        ArrayList<Integer> win = new ArrayList<Integer>();
        int [] places = {2};
        int maxCount = 0;
        int minCount = 0;
        for (int i : lottos) {
            lotto.add(i);
        }
        for (int i : win_nums) {
            win.add(i);
        }
        for(int i = 0 ; i < win.size(); i ++){
            if(lotto.get(i).equals(0)){
                maxCount++;
            }
            else{
                if(win.contains(lotto.get(i))){
                    maxCount++;
                    minCount++;
                }
            }
        }
        if(minCount != 0 && maxCount !=0){
            places  = new int[]{7 - maxCount, 7 - minCount};
        }
        else if(minCount == 0 && maxCount !=0) {
            System.out.println("case 1");
            places  = new int[]{7-maxCount, 6};
        }
        else if(maxCount ==0 && minCount !=0){
           places  = new int[]{6, 6};
        }
        else if (maxCount ==0 && minCount ==0){
            System.out.println("case 2 ");
            places = new int[]{6,6};
        }
        System.out.println(Arrays.toString(places));


        return places;
    }
}
