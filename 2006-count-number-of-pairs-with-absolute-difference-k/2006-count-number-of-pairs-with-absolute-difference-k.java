class Solution {
    public int countKDifference(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count=0;
        for(int i:nums){
            count+=hm.getOrDefault(i-k,0);
            count+=hm.getOrDefault(i+k,0);
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
         
         
return count;

    }
}