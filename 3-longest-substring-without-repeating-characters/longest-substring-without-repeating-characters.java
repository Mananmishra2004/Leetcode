class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;
        
        int low = 0;

        HashMap < Character, Integer> map = new HashMap<>();

        for(int high = 0; high<n;high++){
            int k = high-low+1;
             char ch = s.charAt(high);
                map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.size() < k){
                char c = s.charAt(low);
                map.put(c,map.get(c)-1);
                if(map.get(c)==0){
                    map.remove(c);
                }
                low++;
                k = high-low+1;
            }

            res = Math.max(res,k);



        }

        return res;
    }
}