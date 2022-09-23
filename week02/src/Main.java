1.
int var1=5;
int var2=2;
double var3=var1/var2;
int var4=(int)(var3*var2);
System.out.println(var4);

// 이 코드는 결과가 5가 아닌 4로 출력됩니다.
// 이유는 Java 에서 integer를 나눌때 내림을 하기 때문입니다.
// double var3 = var1/var2; 를 했을시 예상값은 5/2 = 2.5 지만, round off 하기 때문에 2.5 가 아닌 2.0 이 나오게 됩니다.
// 해결 방법은 var1 , var2 둘중 하나를 type double 로 바꿔주면 됩니다.


2.
int x=10;
int y=20;
int z = (++x) + (y--);
System.out.println(z);

// 결과 는 31 이 나오게 됩니다.
// 그 이유로는 x 는 prefix increment 를 사용하고 y 는 postfix decrement 를 사용하기 떄문입니다.
// 이 둘의 차이는 prefix 의 경우 increment/decrement 를 한후 variable 을 보여주는 반면 , postfix 는 먼저 variable 을 보여주고 increment/decrement 합니다.
// 따라서 ++x 는 11 이 나오게 되고, y-- 는 아직 20으로 나오게 됩니다.
// 3번째 줄 아래에 System.out.println(y)를 한다면 19로 나올것입니다.



3.
public class Main {
    public static void main(String[] args) {
        //우선 first 와 second를 선언해줍니다.
        int first = 0;
        int second = 0;
        //first + second 가 6이 아닐 시에 계속 돌아가는 while statement 를 대입해주고
        //first 와 second 를 계속 생성해줍니다.(int) type cast 를 해줌으로 내림을 해줍니다. 6으로 곱하는 이유는  0<=Math.random()<1 이기 때문에 어떤 값이
        // 나오더라도 6은 될수없으며, 0 은 나올수있기에 마지막에 1을 더해줍니다. 만약 Math.random()*6 +1 이 6을 상회하더라도 (int) type cast 로 내려줍니다.
        // 따라서 first , second 의 range 는 1-6 이 됩니다.
        System.out.println("시작!");
        while (first + second != 6) {
            first = (int) (Math.random() * 6) + 1;
            second = (int) (Math.random() * 6) + 1;
            System.out.println("(" + first + "," + second + ")");
        }
        System.out.println("끝!");
    }
}
