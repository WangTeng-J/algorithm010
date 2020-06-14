package Week01;


import java.util.HashMap;
import java.util.Map;

/**
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TowSums {

    public int[] twoSum(int[] nums, int target) {
        //hash表解决
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            int value = target - nums[i];
            if(map.containsKey(value) && i != map.get(value)){
                return new int[]{i, map.get(value)};
            }
            map.put(nums[i],i);
        }
        return null;
    }


}
