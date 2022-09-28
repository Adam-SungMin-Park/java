import java.sql.Array;
import java.util.*;
import java.util.stream.IntStream;
import java.util.*;

public class problem18 {
    //[1,2,3,4,5,1,2,3,4,5,1,3,3,4] (14 counts)
    // pattern 1 = 1,2,3,4,5 ; (14 % 5) -1 .
    // pattern 2 = 2, 1, 2, 3, 2, 4, 2, 5 ; (14 % 8) -1
    // pattern 3 = 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 ; (14 % 10) -1

    public int[] solution(int[] answers) {

        int [] patternA = {1, 2, 3, 4, 5};
        int [] patternB = {2, 1, 2, 3, 2, 4, 2, 5};
        int [] patternC = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int [] count = new int [3];
        for(int i = 0 ; i < answers.length; i++){
            if(patternA[i%5] == answers[i]){
                count[0]++;
            }
            if(patternB[i%8] == answers[i]){
                count[1]++;
            }
            if(patternC[i%10] == answers[i]){
                count[2]++;
            }
        }
        int maxCount = Math.max(count[0], Math.max(count[1],count[2]));
        List<Integer> ranking = new ArrayList<>();
        for( int i = 0 ; i < count.length; i++){
            if(count[i]== maxCount){
                ranking.add(i+1);
            }
        }
        int [] answer = {};
        answer = new int[ranking.size()];
        for(int i =0; i<answer.length; i++) {
            answer[i] = ranking.get(i);
        }
        return answer;
    }
}
