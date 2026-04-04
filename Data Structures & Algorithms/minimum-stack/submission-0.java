class MinStack {

        List<Integer> minStack = new ArrayList<Integer>();
        int min = 0;
    public MinStack() {
            this.minStack = new ArrayList<Integer>();
            this.min = 21345664;
    }
    
    public void push(int val) {
        this.minStack.add(val);
        this.min = Math.min(this.min , val);
    }
    
    public void pop() {
        int x = this.top();
    this.minStack.remove(this.minStack.size() - 1);
this.min = Integer.MAX_VALUE;
    for (int val : minStack) {
        this.min = Math.min(this.min, val);
    }

    }
    
    public int top() {
       return this.minStack.get(this.minStack.size()-1);
    }
    
    public int getMin() {
        return this.min;
    }
}
