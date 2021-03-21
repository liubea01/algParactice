package secondWeek;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MajorElemnt {
    public int majorityElement(int[] nums) {
        //方法一：暴力
        //  hash表记录次数 找到出现次数最多的那个数
        int target = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i], 1);
            }
        }
        // Map.Entry<Integer, Integer> maxValueEntry = null;
        // for(Map.Entry<Integer, Integer> entry: map.entrySet()){
        //     if(maxValueEntry == null || entry.getValue() > maxValueEntry.getValue()){
        //         maxValueEntry = entry;
        //     }

        // }
        // return maxValueEntry.getKey();
        int maxCount = -1;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            maxCount = entry.getValue() > maxCount ? entry.getValue() : maxCount;

        }
        Iterator<Map.Entry<Integer, Integer>> it= map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer, Integer> entry= it.next();
            if(maxCount == entry.getValue()){
                target = entry.getKey();
            }
        }
        return target;
        // 方法二： 超过一半就为多说
//        Arrays.sort(nums);
//        return nums[nums.length/2];

    }
}
