package leetcode1;

import org.junit.Test;

import java.util.Stack;

/**
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 * 示例:
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.getMin();   --> 返回 -2.
 *
 */
public class LeetCode155 {

    class MinStack {
        Stack<Integer> stack=new Stack<Integer>();
        public MinStack() {
        }

        public void push(int x) {
          stack.push(x);
        }

        public void pop() {
          stack.pop();
        }

        public int top() {
          return stack.peek();
        }

//        public int getMin() {
//            while (!stack.isEmpty())
//            {
//
//            }
//        }
    }

    @Test
    public void say()
    {
        MinStack obj = new MinStack();
  obj.push(1);
  obj.pop();
  int param_3 = obj.top();
//  int param_4 = obj.getMin();
    }

}
