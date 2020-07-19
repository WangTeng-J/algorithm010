学习笔记

DP:
找到子问题 ---画画图吧
状态定义 -----------一维不够升级二维(同时需要考虑是否可以用一维数组表示)
定义DP方程 

递归
```
// Java
public void recur(int level, int param) {

  // terminator
  if (level > MAX_LEVEL) {
    // process result
    return;
  }

  // process current logic
  process(level, param);

  // drill down
  recur( level: level + 1, newParam);

  // restore current status

}
```
分治
```
# Python
def divide_conquer(problem, param1, param2, ...):
# recursion terminator
if problem is None:
print_result
return

# prepare data
data = prepare_data(problem)
subproblems = split_problem(problem, data)

# conquer subproblems
subresult1 = self.divide_conquer(subproblems[0], p1, ...)
subresult2 = self.divide_conquer(subproblems[1], p1, ...)
subresult3 = self.divide_conquer(subproblems[2], p1, ...)
…

# process and generate the final result
result = process_result(subresult1, subresult2, subresult3, …)
```