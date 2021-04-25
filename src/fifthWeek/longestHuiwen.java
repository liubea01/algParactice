package fifthWeek;

/**
 * 最长回文字串
 */
public class longestHuiwen {
    public boolean isPalindromic(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // 暴力解法
    public String longestPalindrome(String s) {
        String ans = "";
        int max = 0;
        int len = s.length();
        for (int i = 0; i < len; i++)
            for (int j = i + 1; j <= len; j++) {
                String test = s.substring(i, j);
                if (isPalindromic(test) && test.length() > max) {
                    ans = s.substring(i, j);
                    max = Math.max(max, ans.length());
                }
            }
        return ans;
    }
//    public static void main(String[] args) {
//        String s = "ab";
//        String huiwen = longestPalindrome(s);
//        System.out.println("zuichanghuiwen: "+ huiwen);
//
//    }
//    public static String longestPalindrome(String s) {
//        String longestHuiwen = "";
//        int huiwenLen = 0;
//        if(s == null || s.length() == 0){ return null;}
//        int slen = s.length();
//        if(slen == 1) return s;
//        for(int i = 0; i < slen; i++){
//            for(int j = i + 1; j < slen; j++){
//                int len = j - i +1;
//                String curr = s.substring(i, j + 1);
//                if(isHuiwen(curr)){
//                    if(len > huiwenLen){
//                        longestHuiwen = curr;
//                        huiwenLen = len;
//                    }
//
//                }
//            }
//        }
//        return longestHuiwen;
//    }
//
//    private static boolean isHuiwen(String huiwen){
//        if(huiwen == null || huiwen.length() == 0) {return false;}
//        int len = huiwen.length();
//        for(int i = 0 ; i < len; i++){
//            if(huiwen.charAt(i) != huiwen.charAt(len - i - 1)){
//                return false;
//            }
//        }
//        return true;
//    }

}
