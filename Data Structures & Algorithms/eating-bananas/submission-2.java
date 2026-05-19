class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        

        int start= 1;
        int end=0;
        int ans=0;
        int sum=0;
        for(int i=0;i<piles.length;i++){
            
            end=Math.max(end,piles[i]);
        }
        
        int mid=0;
        while(start<=end){
            mid= start+(end-start)/2;
            int time=0;
            for(int i=0;i<piles.length;i++){
                time+=piles[i]/mid;
                if(piles[i] % mid >0){
                    time++;
                }
                
            }
            if(time>h){
                start=mid+1;
            }else {
                ans=mid;
                end=mid-1;
            }
            
        }
        return ans;
    }
}
