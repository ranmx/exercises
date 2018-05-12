package exercise.ran.a3LongestSubstring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ranmx on 2018/4/2.
 */
public class A3LongestSubstring {
    public int lenthOfLogestSubstring(String s){
        Map<Character, Integer> charIndex = new HashMap<>();
        Map<Integer, List<Integer>> lengthIndexBeginToEnd = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            if (charIndex.containsKey(s.charAt(i))){
                lengthIndexBeginToEnd.put(i-charIndex.get(s.charAt(i)), Arrays.asList()<>({charIndex.get(s.charAt(i)), i}));
            }

        }
    }
}
