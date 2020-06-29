package Week03.leetcode.editor.cn;

import java.util.LinkedList;
import java.util.List;

//Java：组合
public class P77Combinations{
    public static void main(String[] args) {
        Solution solution = new Solution();
    }
    static class Solution {
        List<List<Integer>> res = new LinkedList<>();
        public List<List<Integer>> combine(int n, int k) {
            if(n <0 || k <0 || k>n){
                return res;
            }
            helper(new LinkedList<>(),1,n,k);
            return res;
        }



        private void helper(LinkedList<Integer> add, int begin, int n ,int k){

            if(add.size() == k){
                res.add(new LinkedList<>(add));
            }
            for(int i = begin;i<n+1;i++){
                add.add(i);
                helper(add,begin+1,n,k);
                add.removeLast();
            }


        }
    }
}
//leetcode submit region begin(Prohibit modification and deletion)

//leetcode submit region end(Prohibit modification and deletion)

