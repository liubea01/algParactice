package fifthWeek;

import java.util.HashMap;
import java.util.Map;

/**
 * 字符串中的第一个唯一字符
 */
public class firstUniqueWord {

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1); // map.getOrDefault(key,默认值)新api
        }

        for(int i = 0; i < s.length(); i++){
            char sh = s.charAt(i);
            if(map.get(sh) == 1){
                return i;
            }
        }
        return -1;
    }


}
