package fifthWeek;

/**
 * 验证回文字符串 Ⅱ
 */
public class huiwen2 {
    public boolean validPalindrome(String s) {
        //双指针法
        for(int i = 0 , j = s.length() - 1; i <= j; i++, j-- ){
            if(s.charAt(i) != s.charAt(j)){
                return validPalindrome(s,i+1,j) || validPalindrome(s, i, j-1);
            }
        }
        return true;
    }
    public boolean validPalindrome(String s, int i, int j){
        while(i <= j){
            if(s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }
        return true;
    }

}
