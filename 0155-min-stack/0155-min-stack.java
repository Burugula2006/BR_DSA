class MinStack {
    Stack<Integer> s;
    Stack<Integer> ms;
    public MinStack() {
        s=new Stack<>();
        ms=new Stack<>();
    }
    
    public void push(int value) {
        s.push(value);
        if(ms.isEmpty() || value<=ms.peek())ms.push(value);

    }
    
    public void pop() {
        if(s.isEmpty())return ;
       int x=s.pop();
       if(x==ms.peek())ms.pop();
    }
    
    public int top() {
        if(!s.isEmpty())return  s.peek();
        return -1;
    }
    
    public int getMin() {
        if(ms.isEmpty())return -1;
        return ms.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */