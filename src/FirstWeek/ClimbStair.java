package FirstWeek;

public class ClimbStair {
    public static void main(String[] args){
        int steps = climbStairs(4);
        System.out.println("liubea->step = " + steps);
    }
    public static int climbStairs(int n) {
        //普通的递归
        if(n == 1 || n == 2){
            return n;
        }
        return climbStairs(n - 2) + climbStairs(n - 1);
    }
}
