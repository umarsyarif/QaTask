package JavaPractice2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumMultiplication {
    public static void main(String[] args){
        int[] array = {2, -34, 23, 44, 7, -40, 29, 0, 23, 22};

        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        Collections.sort(list, Collections.reverseOrder());

        int count = 0;
        for(Integer i : list){
            if(count < 3){
                System.out.print(i + ", ");
                count++;
            }else{
                break;
            }
        }
    }
}