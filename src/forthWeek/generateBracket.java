package forthWeek;

import java.util.ArrayList;
import java.util.List;

/**
 * 生成括号
 */
public class generateBracket {

    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        produce(0,0,n,"");
        return res;
    }

    public void produce(int left, int right, int n, String s){
        if(left == n && right == n){
            res.add(s);
            return;
        }
        if(left < n){
            produce(left + 1, right, n ,s + "(");
        }
        if(right < left){
            produce(left, right + 1, n , s + ")");
        }
    }

}
