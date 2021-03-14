package FirstWeek;

import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {

    public int[] twoSum(int[] nums, int target) {
        // 方法一：暴力法 0(n*n)
        // int[] result = new int[2];
        // for(int i = 0; i<nums.length-1; i++){
        //     for(int j = i+ 1; j< nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //             result[0]= i;
        //             result[1] = j;
        //         }
        //     }
        // }

        // return result;

        // 方法2: a + b = target => a = target- b
        // hash表加速查找 0(n)
        // int[] result = new int[2];
        // Map<Integer, Integer> map = new HashMap();
        // for(int i = 0; i< nums.length; i++){
        //    map.put(nums[i],i);
        // }
        // for(int i = 0; i< nums.length; i++){
        //    if(map.containsKey(target - nums[i])){
        //        result[0] = map.get(target - nums[i]);
        //        result[1] = i ;
        //    }
        // }
        // return result;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        return null;
    }


}
