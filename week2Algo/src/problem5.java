import java.util.Arrays;

public class problem5 {
    public String solution(String s) {
        String answer = "";
        String[] test = s.split("");
        int index = 0;
        for (int i = 0; i < test.length; i++) {
            if ((" ").equals(test[i])) {
                System.out.println("space at index: " + i);
                index = 0;
            } else {
                if (index % 2 == 0) {
                    index++;
                    test[i] = test[i].toUpperCase();
                } else {
                    index++;
                    test[i] = test[i].toLowerCase();
                }
            }
            answer += test[i];
        }
        answer = String.join("", test);
        return answer;
    }
}
