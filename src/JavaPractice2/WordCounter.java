package JavaPractice2;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args){
        String a = "work hard party hard";
        Map<String, Integer> map = new HashMap<String, Integer>();

        for(String s : a.split(" ")){
            int value = map.get(s) == null ? 0 : map.get(s);
            map.put(s, value + 1);
        }

        for(String s : map.keySet()){
            System.out.println(s + " -->  " + map.get(s));
        }
    }
}
