class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] ans=new int[spells.length];
        for(int i=0;i<spells.length;i++){
            ans[i]=helper(spells[i],potions,success);
        }
        return ans;
    }

    int helper(int i,int[] potions,long success){
        int low=0;
        int high=potions.length-1;
        int k=-1;
        while(low<=high){
            int mid=low+((high-low)/2);
            if((long)potions[mid]*i>=success){
                high=mid-1;
                k=mid;
            }
            else{
                low=mid+1;
            }
        }

        if(k==-1)return 0;
        return potions.length-k;
    }
}
