package JavaPractive1;
import java.util.Scanner;

public class EvenOddPrime {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Ketikkan bilangan A: ");
        int a = in.nextInt();
        
        System.out.print("Ketikkan bilangan B: ");
        int b = in.nextInt();

        for(int i = a; i <= b; i++){
            System.out.print(i + checkNum(i) + ", ");
        }

        in.close();
    }

    private static String checkNum(int i) {
        String val = " ";
        if(i % 2 == 0){
            val += "is even";
        }else{
            val += "is odd";
        }
        val += isPrime(i) ? " prime" : "";
        return val;
    }

    private static boolean isPrime(int i) {
        boolean isPrime = true;
        if(i <= 1){
            isPrime = false;
        }else {
            for(int j = 2; j <= i/2; j++){
                if (i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
}
