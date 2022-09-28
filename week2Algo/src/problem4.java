import java.util.*;

public class problem4 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        // 둘이 같은 array
        // [adam,suu,jae]
        // [adam,jae]
        int i = 0;
        for ( i = 0; i < completion.length; i++) {
            if (!completion[i].equals(participant[i])) {

                break;
            }

        }
        System.out.println(Arrays.toString(participant));
        System.out.println(Arrays.toString(completion));
        System.out.println(i);
        System.out.println(participant[i]);
        return answer;
    }

}

//class Solution {
//    public String solution(String[] participant, String[] completion) {
//        String answer = "";
//        HashMap<String, Integer> hm = new HashMap<>();
//        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
//        for (String player : completion) hm.put(player, hm.get(player) - 1);
//
//        for (String key : hm.keySet()) {
//            if (hm.get(key) != 0){
//                answer = key;
//            }
//        }
//        return answer;
//    }
//}
