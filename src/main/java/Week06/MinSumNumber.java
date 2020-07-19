package Week06;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @CLASSNAME:MinSumNumber
 * @AUTHOR: wangteng
 * @TIME: 2020-07-1718:53
 */
public class MinSumNumber {


//    List<String> res = new LinkedList<>();
    static int[] nums = new int[]{16,15,27,9};

    //拼接成最小  1516279


    static int min = 0;
    public static void main(String[] args) {
//        System.out.println(0x1<<5);
        permutation("");
    }


    public static void permutation(String s) {
        System.out.println(dfs(0, min));
    }
     static int  dfs(int x, int min) {
        if(x == nums.length - 1) {
            return min;
        }
        for(int i = x; i < nums.length; i++) {
            swap(i, x); // 交换，将 c[i] 固定在第 x 位
            int dfs = dfs(x + 1, min);// 开启固定第 x + 1 位字符
            if(dfs < min){
                min = dfs;
            }
            swap(i, x); // 恢复交换
        }
        return min;
    }
    static void swap(int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
