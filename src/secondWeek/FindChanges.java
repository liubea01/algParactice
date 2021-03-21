package secondWeek;

public class FindChanges {
    public boolean lemonadeChange(int[] bills) {
        //贪心算法 :局部最优->问题的最优解
        //思路： 1，5块的直接收下 2. 10块的收下 找回5块
        //3. 20的收下 找回两种方式
        // 3.1 一个10块 一个5块   3.2 3个5块
        int five = 0, ten = 0;
        for(int bill : bills){
            if(bill == 5 ){
                five ++;
            }else if(bill == 10){
                if(five <1 ){
                    return false;
                }
                five--;
                ten++;
            }else{
                if(five >= 1 && ten >= 1){
                    five--;
                    ten--;
                }else if( five >=3){
                    five -= 3;
                }else{
                    return false;
                }
            }
        }
        return true;

    }
}
