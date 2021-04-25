package forthWeek;

/**
 * 颠倒二进制数据
 */
public class reverseBit {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        for(int i = 0; i < 32; i++){
            res = res << 1; // 空出一位来装n的最低位
            res += n & 1; // n&1 得到n的最低位
            n = n >>>1; // 抹掉最低位
        }
        return res;
    }

}
