import java.util.ArrayList;
import java.util.*;

public class problem31 {
    public int[] solution(int N, int[] stages) {
        //5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
        //
        int[] answer = {};
        int failure = 0;
        int numPlayer = stages.length;
        List<Integer> stageList = new ArrayList<Integer>();
        HashMap<String,Integer> stageCounter = new HashMap<String,Integer>();
        for (int stage : stages) {
            stageList.add(stage);
        }


        for (int i = 1; i <stageList.size() ; i++){
            if(!stageCounter.containsKey("Stage: "+ stageList.get(i))){
                stageCounter.put("Stage: "+ stageList.get(i),stageList.get(i));
            }

        }

        System.out.println(stageCounter);

        return answer;
    }
}
