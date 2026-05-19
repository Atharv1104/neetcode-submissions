class Solution {
    public int characterReplacement(String s, int k) {
        int count=0;
        int maxcount=0;
        int left=0;
        int maxf=0;
        int maxlen=0;
        
        Map <Character,Integer> map= new HashMap<>();
        for(int right=0;right<s.length();right++){
            
            char ch=s.charAt(right);
            
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxf=Math.max(maxf,map.get(ch));

            while((right-left +1)-maxf>k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            maxlen=Math.max(maxlen,(right-left+1));
            
        }
            
        return maxlen;
        
    }
}
