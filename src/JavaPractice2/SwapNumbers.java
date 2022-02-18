package JavaPractice2;

public class SwapNumbers {
    public static void main(String[] args){
        int a = 1, b = 2;
        System.out.println("Before swap: A = "+ a + ", B = " + b);

        a += b;
        b = a-b;
        a = a-b;
        System.out.println("After swap: A = "+ a + ", B = " + b);
    }
}
