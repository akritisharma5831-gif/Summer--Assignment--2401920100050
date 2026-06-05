class Solution {
    public void reverseString(char[] st) {
        reverse(st,0,st.length-1);}

        void reverse(char[]st,int s,int e){
        char t;
        
        if(s>=e){
            return  ;
        }
        else{
            t=st[s];
            st[s]=st[e];
            st[e]=t;
            reverse(st,s+1,e-1);
        }
        }


        
        
    
}
