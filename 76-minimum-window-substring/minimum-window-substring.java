class Solution {
   boolean fun(int[]have, int[]needed){
        for(int i = 0 ; i<have.length;i++){
            if(have[i]<needed[i]){
                return false;
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {
        int needed[] = new int [256];
        int have[] = new int [256];
        int low =0;
        int res =Integer.MAX_VALUE;
        int start = -1;
        if(s.length()<t.length()){
            return "";
        }

        for (int i = 0; i<t.length();i++){
            needed[t.charAt(i)]++;
        }

        for (int high=0; high<s.length();high++){
            have[s.charAt(high)]++;
            while(fun(have,needed)){
                int len = high-low+1;
                if(res>len){
                    res=len;
                    start = low;
                }
                have[s.charAt(low)]--;
                low++;

            }

        }

        if(res==Integer.MAX_VALUE){
            return "";
        }

        return s.substring(start,res+start);
    }
}