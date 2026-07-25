class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList <Integer> pos = new ArrayList<>();
        ArrayList <Integer> neg = new ArrayList<>();
        ArrayList <Integer> result = new ArrayList<>();
       
        for (int i =0 ; i<nums.length;i++){
            if(nums[i]<0){
                neg.add(nums[i]);
            }
            else{
                pos.add(nums[i]);
            }
        }
        //   case 1 if all positive values
            if (neg.size()==0){
                for(int k =0; k<pos.size(); k++){
                    result.add(k,pos.get(k)*pos.get(k));

                }
                return result.stream().mapToInt(Integer::intValue).toArray();
            }

        // case 2 if all negative values

              if (pos.size()==0){
                for(int k =0; k<neg.size(); k++){
                    result.add(k,neg.get(k)*neg.get(k));

                }
                 Collections.reverse(result);
                return result.stream().mapToInt(Integer::intValue).toArray();
            }

        //   case 3 both positive and negative values are present   

            
        for(int i = 0; i<neg.size(); i++){
            neg.set(i,neg.get(i)*neg.get(i));
            
        }
            
        for(int i = 0; i<pos.size(); i++){
            pos.set(i,pos.get(i)*pos.get(i));
            
        }
        Collections.reverse(neg);

       int  i=0;
        int j=0;
        while(i<neg.size() && j<pos.size()){
            if(neg.get(i)<pos.get(j)){
                result.add(neg.get(i));
                i++;
            }
            else{
                result.add(pos.get(j));
                j++;
            }
        }
        while(i<neg.size()){
            result.add(neg.get(i));
            i++;
        }

        while(j<pos.size()){
            result.add(pos.get(j));
            j++;
        }

        for( i = 0 ; i<result.size();i++){
            nums[i]=result.get(i);
        }

        return nums;
    }
}