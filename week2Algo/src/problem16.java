import java.util.*;

public class problem16 {
    public int[] solution(int[] numbers) {
        //[5,0,2,7] - > [2,5,7,9,12]
        int[] answer = {};
        Set<Integer> map = new HashSet<>();
        for(int i = 0 ; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++ ){
                map.add(numbers[i] + numbers[j]);
            }
        }
        List<Integer> sortedAns = new ArrayList<Integer>(map);
        Collections.sort(sortedAns);
        int [] ansMap = sortedAns.stream().mapToInt(i -> i).toArray();



        return ansMap;
    }
}
