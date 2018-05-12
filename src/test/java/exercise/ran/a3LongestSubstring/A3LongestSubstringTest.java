package exercise.ran.a3LongestSubstring;

import org.junit.Test;

public class A3LongestSubstringTest {

    @Test
    public void runTest() {
        A3LongestSubstring a3LongestSubstring = new A3LongestSubstring();
        System.out.println(a3LongestSubstring.lenthOfLogestSubstring("abcabcbb"));

        System.out.println(a3LongestSubstring.lenthOfLogestSubstring("bbbbb"));

        System.out.println(a3LongestSubstring.lenthOfLogestSubstring("pwwkew"));

        System.out.println(a3LongestSubstring.lenthOfLogestSubstring("a"));

        System.out.println(a3LongestSubstring.lenthOfLogestSubstring("abcdefefghijk"));

        System.out.println(a3LongestSubstring.lenthOfLogestSubstring("abcdeababcabcdabcde"));

        System.out.println(a3LongestSubstring.lenthOfLogestSubstring("abcdefababcabcdabcde"));

        System.out.println(a3LongestSubstring.lenthOfLogestSubstring("ababcdefabcabcdabcde"));

        System.out.println(a3LongestSubstring.lenthOfLogestSubstring("ababcabcdefabcdabcde"));

        System.out.println(a3LongestSubstring.lenthOfLogestSubstring("ababcabcdabcdefabcde"));

        System.out.println(a3LongestSubstring.lenthOfLogestSubstring("ababcabcdabcdeabcdef"));

        System.out.println(a3LongestSubstring.lenthOfLogestSubstring("ggububgvfk"));


    }
}
