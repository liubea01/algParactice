package thirdWeek;

public class HuiwenSubString {
    public int countSubstrings(String s) {
        // 方法一：动态规划 dp[i][j] 为true或false count记录回文个数
        if(s == null || s.length() == 0){
            return 0;
        }
        char[] chars = s.toCharArray();
        int count = 0;
        boolean[][] dp = new boolean[chars.length][chars.length];
        for(int i = chars.length -1; i >=0; i--){
            for(int j = i; j <chars.length; j++){
                if(chars[i] == chars[j]){
                    if(j - i <=1){
                        dp[i][j] = true;
                        count++;
                    }else if(dp[i+1][j-1]){

                        dp[i][j] = true;
                        count++;

                    }
                }
            }
        }
        return count;

    }
}
