package FirstWeek;

public class DeleteDuplicateItem {
    public int removeDuplicates(int[] nums) {
        //快慢指针
        //快指针先走；
        //如果nums[fast] == nums[slow], fast += 1；
        // 如果nums[fast] != nums[slow], slow += 1, nums[slow] = nums[fast]；
        //最终索引(0，slow)区域内的元素即为无重复项的元素。

        int fast = 0;
        int slow = 0;
        for(; fast< nums.length;){
            if(nums[fast] == nums[slow]){
                fast++;
            }else{
                slow++;
                nums[slow] = nums[fast];
            }
        }

        return slow+1;

    }
}
