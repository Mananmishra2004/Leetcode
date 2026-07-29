class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int res = 0;
        int low = 0;
        int maxfreq = 0;

        HashMap <Character,Integer> map = new HashMap<>();
        for (int high = 0; high<n; high++){
            char c = s.charAt(high);
            map.put(c,map.getOrDefault(c,0)+1);
            maxfreq = Math.max(maxfreq,map.get(c));

            while(high-low+1 - maxfreq > k ){
               char c_low = s.charAt(low);
                map.put(c_low,map.get(c_low)-1);
                low++;
            }

            int len = high-low+1;

            res = Math.max(res,len);
        }
        return res;
    }
}