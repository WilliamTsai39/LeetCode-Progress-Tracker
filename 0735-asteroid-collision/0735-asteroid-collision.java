class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        //init
        //if + -> add into stack
        //if - compare, if small doesn't store, elif if large don't pop stack

        Stack<Integer> stack = new Stack<>();
        for(int i : asteroids) {
            if(i > 0) stack.push(i);
            else {
                while(!stack.isEmpty() && stack.peek() < Math.abs(i) && stack.peek() > 0) {
                    stack.pop();
                }
                if(stack.isEmpty() || stack.peek() < 0) stack.push(i);
                if(stack.peek() == -i) stack.pop();
            }
        }

        System.gc();
        int[] res = new int[stack.size()];
        for(int j = stack.size() - 1; j >= 0; j--) {
            res[j] = stack.pop();
        }
        return res;
    }
}