package Week04;

import java.util.Map;

//Java：跳跃游戏 II
public class P45JumpGameIi{
    public int jump(int[] nums) {

        int step = 0;

        int maxStep = 0;


        int end = 0;


        for(int i =0; i<nums.length-1 ; i++){

            maxStep = Math.max(i+nums[i], maxStep );

            if(i == end){
                end = maxStep;
                ++step;
            }

        }

        return step;
    }
}
//leetcode submit region begin(Prohibit modification and deletion)
//leetcode submit region end(Prohibit modification and deletion)

