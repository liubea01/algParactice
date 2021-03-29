package thirdWeek;

public class JieMa {
    public int numDecodings(String s) {
        //      int len = s.length();
        // int[] dp = new int[len + 1];
        // dp[len] = 1; //将递归法的结束条件初始化为 1
        // //最后一个数字不等于 0 就初始化为 1
        // if (s.charAt(len - 1) != '0') {
        //     dp[len - 1] = 1;
        // }
        // for (int i = len - 2; i >= 0; i--) {
        //     //当前数字时 0 ，直接跳过，0 不代表任何字母
        //     if (s.charAt(i) == '0') {
        //         continue;
        //     }
        //     int ans1 = dp[i + 1];
        //     //判断两个字母组成的数字是否小于等于 26
        //     int ans2 = 0;
        //     int ten = (s.charAt(i) - '0') * 10;
        //     int one = s.charAt(i + 1) - '0';
        //     if (ten + one <= 26) {
        //         ans2 = dp[i + 2];
        //     }
        //     dp[i] = ans1 + ans2;

        // }
        // return dp[0];

        // 方法一： 动态规划  取一个字符或者   s[i]s[i-1] < =26  两个字符
        // 分治 子问题  解码数f(n) = f(n -1) + f(n -2)
        // 状态数组： dp[i]
        // 状态方程 dp[i] = dp[i -1] + dp[i-2]

        int length = s.length();
        int dp[] = new int[length + 1];
        dp[length] = 1;
        if(s.charAt(length -1) !='0'){
            dp[length - 1] = 1;
        }

        for(int i = length - 2; i >= 0 ; i--){
            if(s.charAt(i) == '0'){
                continue;
            }
            int ans1 = dp[i + 1]; // 取前一个字符 相当于爬一级台阶
            int ans2 = 0;
            int ten = (s.charAt(i) - '0') * 10; // 字符0-9的ASCII码：48-57；
            int ge = (s.charAt(i + 1) - '0');
            if(ten + ge <= 26){
                ans2 = dp[i + 2]; // 取前两个字符 相当于爬两级台阶
            }
            dp[i] = ans1 + ans2;
        }

        return dp[0];

    }
}
