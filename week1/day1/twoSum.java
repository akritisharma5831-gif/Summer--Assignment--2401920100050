
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int c[]=new int[2];
        int a=0;
        int b=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    a=i;
                    b=j;
                }
            }
        }
        c[0]=a;
        c[1]=b;
        return c;
    }
}
