import java.lang.reflect.Array;
import java.util.*;

public class problem6 {
    public int solution(int n) {
        int answer = 0;
      while(n > 0){
         answer += (n%10);
          n = n /10;
      }

        System.out.println(answer);
        return answer;
    }
}
