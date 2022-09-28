public class problem11 {

        public int solution(long num) {
            int answer = 0;
            while(num !=1){
                if(num%2 ==0){
                    num /= 2;
                }
                else{
                    num =(num*3) +1;
                }
                answer++;
                if(answer >= 500){
                    break;
                }
            }
            System.out.println(answer);
            return answer;
        }

}
