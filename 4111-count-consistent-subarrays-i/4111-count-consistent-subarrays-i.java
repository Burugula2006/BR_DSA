class Solution {
    public int countConsistent(int[] nums) {
       
        int c=0;
        for(int i=0;i<nums.length;i++){

            int and=-1;
            int min=Integer.MAX_VALUE;

            for(int j=i;j<nums.length;j++){

                min=Math.min(min,nums[j]);
                and=and&nums[j];

                if(and==min){
                    c++;
                }
           }
        }
        return c;

    }
}