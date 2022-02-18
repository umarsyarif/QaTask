package JavaPractice2;

public class CountPositiveNegative {
    public static void main(String[] args){
        int[] inputs = {-4, 3, -9, 0, 4, 1};

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(int i : inputs){
            if(i == 0){
                zero++;
                continue;
            }
            if(i > 0){
                positive++;
            }else{
                negative++;
            }
        }

        System.out.println((double) positive / inputs.length);
        System.out.println((double) negative / inputs.length);
        System.out.println((double) zero / inputs.length);
    }
}
