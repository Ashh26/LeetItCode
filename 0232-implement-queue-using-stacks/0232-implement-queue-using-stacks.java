class MyQueue {
    Stack<Integer> stack;
    public MyQueue() {
        stack=new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        if(stack.isEmpty()) return -1;

        if(stack.size()==1) return stack.pop();

        int top=stack.pop();
        int ans=pop();
        stack.push(top);
        return ans;
    }
    
    public int peek() {
        if(stack.isEmpty()) return -1;

        if(stack.size()==1) return stack.peek();

        int top=stack.pop();
        int ans=peek();
        stack.push(top);
        return ans;
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */