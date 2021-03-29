package thirdWeek;

public class Fibnacco {
    public static void main(String[] args){
        int fib2 = fib2(6);
        int fib = fib(6);
        System.out.println("liubea->fib2 = "+ fib2);
        System.out.println("liubea->fib = "+ fib);

    }
    public static int fib(int n){
        int[] memo = new int[n+1];
        if(n <= 1){
            return n;
        }
        if(memo[n] == 0){
            memo[n] = fib(n - 1) + fib(n - 2);
        }
        return memo[n];
    }

    public static int fib2(int n){
        if(n <= 1){
            return n;
        }
        return fib2(n - 1) + fib2(n - 2);
    }
}
