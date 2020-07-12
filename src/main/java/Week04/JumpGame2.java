package Week04;

/**
 * @CLASSNAME:JumpGame2
 * @AUTHOR: wangteng
 * @TIME: 2020-07-0120:09
 */
public class JumpGame2 {


    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,1,4,1,4,5,2,1};
        int jump = jump(nums);
        System.out.println(jump);
    }


    public static int jump(int[] nums){
        //步长
        int maxStep = 0;

        // 结束
        int end =0;

        //步数
        int step =0;

        for(int i =0; i< nums.length-1 ; i++){
            maxStep = Math.max(maxStep, i+nums[i]);
            if(i == end){
                ++step;
                end = maxStep;
            }
        }
        return step;
    }

}
