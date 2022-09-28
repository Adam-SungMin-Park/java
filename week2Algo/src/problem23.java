import java.util.ArrayList;
import java.util.Arrays;

public class problem23 {
    public String solution(String s, int n){
        String ans = "";
        for ( int i = 0 ; i  < s.length(); i ++){
            char cha = s.charAt(i);
            if(Character.isUpperCase(cha)){
                cha = (char) ((cha - 'A'+n)% 26 + 'A');
            }
            else if(Character.isLowerCase(cha)){
                cha = (char) ((cha - 'a'+n)% 26 + 'a');
            }
            ans += cha;
        }

        System.out.println(ans);

        return ans;

    }
}
