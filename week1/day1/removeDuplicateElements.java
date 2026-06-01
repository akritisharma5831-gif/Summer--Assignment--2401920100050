import java.util.Arrays;
 class Solution {
    public static void main(String[] args) {
        int[] arr={4,2,2,6};
        Arrays.sort(arr);
        int c=0;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]==arr[j+1]){
                    c++;
                }

            }
           
        int[]d=dup(arr);
        System.out.println(Arrays.toString(d));
    }
       static int[] dup(int[]arr){
        int k=0;
        int[] a=new int[c];
        a[0]=arr[0];
        for(int i=1;i<arr.length;i++){
                if(a[k]!=arr[i]){
                    k++;
                    a[k]=arr[i];
                    
                }
            }

         return a;
        }
    }

