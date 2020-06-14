package Week01;

public class MoveZero {
    /**
     * 输入: [0,1,0,3,12]
     * 输出: [1,3,12,0,0]
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        if(nums == null){
            return;
        }
        int j = 0;
        for(int i =0;i <nums.length;i++){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j++] = tmp;
        }

    }

}
