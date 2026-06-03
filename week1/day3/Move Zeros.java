class Solution {
    public void moveZeroes(int[] nums) {
        System.out.println("count zeros");
        int n=nums.length;
        int c=0;
        int k=0;
        int[]b=new int[n];
    
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                b[k++]=nums[i];
            }
        }
        for(int i=0;i<k;i++){
            nums[i]=b[i];
        }
        for(int i=k;i<n;i++){
            nums[i]=0;
        }


        
        
    }
}
