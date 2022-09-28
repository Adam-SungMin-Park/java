import java.util.*;

public class problem30 {
    public int solution(int n) {
        int primeFactor = 0;
        List<Integer> primes = new ArrayList<Integer>();
        for(int i = 3 ; i <= n; i++ ){
            for(int j = 2; j <= i/2; j++){
                if(i%j == 0){
                    primeFactor++;
                    break;
                }
            }
            if(primeFactor ==0){
                primes.add(i) ;
            }
            primeFactor=0;
        }

        return primes.size()+1;
    }
}
