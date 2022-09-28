import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class problem19 {
    public String[] solution(String[] strings, int n) {

        ArrayList<String> sortedAnswer = new ArrayList<String>();
        // sort by the nth index
        ArrayList sortedAns = new ArrayList<String>();
        for (String string : strings) {
                sortedAns.add(string.charAt(n)+string);
        }

        Collections.sort(sortedAns);
        for ( int i = 0 ; i < sortedAns.size(); i++){
            String trimmed = sortedAns.get(i).toString();
            String subTrimmed = trimmed.substring(1,trimmed.length());
            sortedAnswer.add(subTrimmed);
        }



        //String[] stringArray = list.toArray(new String[0]);
        String[] answer = sortedAnswer.toArray(new String[0]);
        System.out.println(Arrays.toString(answer));


        return answer;
    }
}
