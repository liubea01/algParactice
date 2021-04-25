package forthWeek;

public class countOne {

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int result = 0;
        while(n != 0){
            result++;
            n =  n & (n -1);
        }
        return result;
    }

}
