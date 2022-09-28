import java.util.Arrays;

public class problem28 {
    public int[] solution(int n, int m) {
        int[] answer = {0,0};
        //210 , 45 =
        int greatComDiv = gcd(n,m);
        int leastComMul = lcm(n,m);

        System.out.println(greatComDiv);
        System.out.println(leastComMul);

        answer[0 ] = greatComDiv;
        answer[1] = leastComMul;
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static int gcd(int a , int b){
        int higherNum = Math.max(a,b);
        int lowerNum = Math.min(a,b);
        if(lowerNum ==0)
            return higherNum;
        return gcd(higherNum%lowerNum, lowerNum);
    }

    public static int lcm(int a , int b){
        int higherNum = Math.max(a,b);
        int lowerNum = Math.min(a,b);
        int lcm = higherNum;
        while(lcm % lowerNum!=0){
            lcm += higherNum;
        }
    return lcm;
    }
}
