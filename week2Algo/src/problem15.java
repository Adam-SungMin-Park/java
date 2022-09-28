public class problem15 {
    public int solution(int n) {

        String ternary = "";
        while(n!=0){
            ternary += (n % 3);
            n = n/3;
        }

        int deci =  Integer.parseInt(ternary,3);
        System.out.println(deci);

        return deci;
    }

}
