class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int res = 0;
        int left =0;
        HashMap  <Integer, Integer> f = new HashMap<>();

        for (int right = 0; right<n; right++){
            f.put(fruits[right],f.getOrDefault(fruits[right],0)+1);

            while(f.size()>2){
                int leftfruit = fruits[left];

                f.put(leftfruit,f.get(leftfruit)-1);

                if (f.get(leftfruit)==0){
                    f.remove(leftfruit);
                    
                }
                left++;
            }

            int len = right - left +1;

             res = Math.max(res,len);
        }
        return res;
    }
}