package JavaPractive1;
import java.util.Scanner;
import java.util.Set;

public class Consonant {
    private static final Set<String> vocal = Set.of("A","I","U","E","O");
    private static final Set<String> number = Set.of("1","2","3","4","5","6","7","8","9","0");

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Ketikkan kalimat :");
        String input = in.nextLine();
        checkSentence(input);
        
        in.close();
    }

    private static void checkSentence(String input) {
        String[] split = input.toUpperCase().split("");
        for (String s : split) {
            if(vocal.contains(s)){
                continue;
            }
            if(number.contains(s)){
                parseNumber(Integer.parseInt(s));
                continue;
            }
            System.out.print(s);
        }
    }

    private static void parseNumber(int s) {
        switch(s){
            case 1:
                System.out.print("ST");
                break;
            case 2:
                System.out.print("D");
                break;
            case 3:
                System.out.print("TG");
                break;
            case 4:
                System.out.print("MPT");
                break;
            case 5:
                System.out.print("LM");
                break;
            case 6:
                System.out.print("NM");
                break;
            case 7:
                System.out.print("TJH");
                break;
            case 8:
                System.out.print("DLPN");
                break;
            case 9:
                System.out.print("SMBLN");
                break;
            case 0:
                System.out.print("NL");
                break;
            default:
                System.out.print("");
        }
    }
}
