public class problem1 {
    // a = month b = day
    // 1월 1 일
    // date = 31;
    // date = 31 + b -1  ==> 31 +12 -1 ==> 42
    // day[date%7] ==> day[0]
    public String solution(int a , int b){
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int date = 0;
        for (int i = 0; i < a - 1; i++) {
            date += month[i];
        }

        date += b - 1;
        System.out.println(day[date % 7]);
        return day[date % 7];
    }

}
