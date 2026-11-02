class Solution {
    public int heightChecker(int[] heights) {
        int[] count=new int[101];
        for(int i:heights){
            count[i]++;
        }

        int ans=0;
       
        int p=0;
       
        for(int i=0;i<heights.length;i++){
            while(p<count.length&&count[p]==0)p++;
           
                if(heights[i]!=p){
                    ans++;
                   
                }
                
                    
                    
                      
                       count[p]--;
                    
                

            
            
        
        }
        return ans;
    }
}
