package Week01;

import java.util.Stack;

public class Trap {
    public int trap(int[] height) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        int cur = 0;
        while (cur < height.length) {
            //如果当前指向的高度大于栈顶高度就一直循环
            while (!stack.empty() && height[cur] >  height[stack.peek()]) {
                //peek元素
                int h = height[stack.peek()];
                stack.pop();
                if (stack.empty()) {
                    break;
                }
                //计算两个柱子间的距离
                int distance = cur - stack.peek() - 1;
                int min = Math.min(height[stack.peek()], height[cur]);
                sum = sum + distance * (min - h);
            }
            stack.push(cur++);
        }
        return sum;
    }

}
