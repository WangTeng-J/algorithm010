package Week07;
//Java：跳跃游戏 II
public class P45JumpGameIi{
        // TO TEST
     public int jump(int[] nums) {


         //-------当前index选与不选--------
         //i+nums[i] or null
         int step = 0;
         int maxValue = 0;
         int end = 0;

         for(int i = 0 ; i<nums.length; i++){
            maxValue = Math.max(i+nums[i], maxValue);
            if(end == i){
                ++step;
                end = maxValue;
            }

         }
        return maxValue;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

