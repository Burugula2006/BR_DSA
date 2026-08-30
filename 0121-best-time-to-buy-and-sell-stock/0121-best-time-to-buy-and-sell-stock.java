class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int res=Integer.MIN_VALUE;
        for(int i:prices){
            min=Math.min(i,min);
            int p=i-min;
            res=Math.max(p,res);
        }
        return res;
    }
}