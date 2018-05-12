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
        int lastDup = -1;
        int ans = 0;

        for(int i=0; i<s.length(); i++) {
            if (charIndex.containsKey(s.charAt(i))){
                int length = i-Math.max(lastDup, charIndex.get(s.charAt(i)));
                lastDup = Math.max(charIndex.get(s.charAt(i)), lastDup);
                ans = Math.max(length, ans);
            } else {
                ans = Math.max(i-lastDup, ans);
            }
            charIndex.put(s.charAt(i), i);
        }
        return ans;
    }
}
