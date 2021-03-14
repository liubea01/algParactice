package FirstWeek;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        //方法一：新开数组 (i+k)%nums.length
        // int[] temp = new int[nums.length];
        // for(int i = 0; i< nums.length; i++){
        //     temp[i] = nums[i];
        // }

        // for(int i = 0 ; i< temp.length; i++){
        //     nums[(i+k)%nums.length] = temp[i];
        // }

        //方法2: 反转
        //全部反转
        //前k个反转
        //length - k个反转

        int length = nums.length;
        k %= length; // ??
        reverse(nums, 0 , nums.length-1);
        reverse(nums,0,k -1);
        reverse(nums,k, nums.length-1);
    }

    public void reverse(int[] arr, int start, int end){
        if(arr == null || arr.length == 0){return;}
        while(start < end){
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }
}
