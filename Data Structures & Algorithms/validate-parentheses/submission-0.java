class Solution {
    public boolean isValid(String s) {
        Stack<Integer>st = new Stack<>();
    
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push((int)s.charAt(i));
            }else{
                if(st.size()==0){
                    return false;
                }if(s.charAt(i)==')' && st.peek()=='(' 
                || s.charAt(i)=='}' && st.peek()=='{'
                || s.charAt(i)==']' && st.peek()=='['){
                    st.pop();
                }else{
                    return false;
                }

            }
        }
        return st.size()==0;
    }
}
