class MinStack {
    private Stack<Long> stack;
    private long minEle;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(0L);
            minEle = val;
        } else {
            long diff = (long) val - minEle;
            stack.push(diff);
            if (diff < 0) {
                minEle = val;
            }
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;
        long top = stack.pop();
        if (top < 0) {
            minEle = minEle - top;
        }
    }

    public int top() {
        if (stack.isEmpty()) return -1;
        long top = stack.peek();
        if (top >= 0) {
            return (int) (minEle + top);
        } else {
            return (int) minEle;
        }
    }

    public int getMin() {
        if (stack.isEmpty()) return -1;
        return (int) minEle;
    }
}
