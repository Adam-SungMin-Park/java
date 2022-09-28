//public class problem14 {
//    public int solution(int[] numbers) {
//        int answer = 0;
//        // int [] 중 1-9 까지 중 없는 수들을 다 찾아서 더한 수.
//        int [] oneToNine = {1,2,3,4,5,6,7,8,9};
//        ArrayList<Integer> zeroToNineArr = new ArrayList<>();
//        for (int number : oneToNine) { // how to loop through the int [];
//            zeroToNineArr.add(number);
//        }
//        for (int number: numbers)  {
//            if(zeroToNineArr.contains(number)){ // check if the arr contains the number []
//                zeroToNineArr.remove(number);
//            }
//        }
//        for (Integer integer:zeroToNineArr) {
//            answer+= integer;
//        }
//
//        return answer;
//    }
//}

//public class problem14 {
//    public int solution(int[] numbers) {
//        int sum = 45;
//        for(int number : numbers){
//            sum -= number;
//        }
//        return sum;
//
//    }
//}


//public class problem15 {
//    public String[] solution(String[] strings, int n) {
//        String[] answer = new String[strings.length];
//
//
//        ArrayList<String> currentString = new ArrayList<String>();
//        for (String string : strings) {
//            currentString.add(string.charAt(n)+ string);
//        }
//        Collections.sort(currentString);
//        for(int i = 0 ; i <currentString.size(); i++){
//            answer[i] = currentString.get(i).substring(1);
//        }
//
//        return answer;
//    }
//}

