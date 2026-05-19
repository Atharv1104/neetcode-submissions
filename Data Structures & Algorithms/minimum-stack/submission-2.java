class MinStack {
 Stack <Integer> min= new Stack<>();
 
 Stack <Integer>main= new Stack<>();
    public MinStack() {
        
        
    }
    
    public void push(int val) {
        
        if(min.isEmpty() || val<=min.peek()){
            min.push(val);
            
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
