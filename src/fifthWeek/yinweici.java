package fifthWeek;

import java.util.Arrays;

/**
 * 有效的字母异位词
 */
public class yinweici {

    public boolean isAnagram(String s, String t) {
        if(s == null || s.length() == 0) return false;
        if(t == null || t.length() == 0) return false;
        if(s.length() != t.length()) return false;
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chart);
        for(int i = 0; i < chars.length; i++){
            if(chars[i] != chart[i]) return false;
        }
        return true;

    }

}
