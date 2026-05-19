class MinStack {
 Stack <Integer> min= new Stack<>();
 int currmin=Integer.MAX_VALUE;
 Stack <Integer>main= new Stack<>();
    public MinStack() {
        
        
    }
    
    public void push(int val) {
        
        if(min.isEmpty() || val<=currmin){
            min.push(val);
            currmin=val;
        }
        main.push(val);
    }
    
    public void pop() {
        
        if(main.peek().equals(min.peek())){
            min.pop();
        }
        main.pop();
    }
    
    public int top() {
       return main.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
