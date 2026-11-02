class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            int low=i+1;
            int high=arr.length-1;
            if(arr[i]<0){
                if(i>=0){
              low=0;
              high=i-1;
            }
              else continue;
            }
           boolean check=checker(arr[i]*2,low,arr,high);
           if(check)return true;
        }
        return false;
    }

    boolean checker(int doub,int low,int[] arr,int high){
      
      while(low<=high){
        int mid=low+(high-low)/2;
        if(arr[mid]==doub)return true;
        else if(arr[mid]<doub)low=mid+1;
        else high=mid-1;
      }

      return false;
    }
}
