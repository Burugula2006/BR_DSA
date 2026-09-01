class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> res= new ArrayList<>();
        //add at first"
        if(intervals.length==0)return new int[][]{newInterval};
        boolean b=false;

        //add in middle
        for(int i[]:intervals){
            if( !b&&i[1]>=newInterval[0] ){
                res.add(newInterval);
                b=true;
            }
            
                res.add(i);
            
        }
        //add at last
        if(!b)res.add(newInterval);
        int result[][]=res.toArray(new int[res.size()][]);
        int start=result[0][0];
        int end=result[0][1];
        ArrayList<int[]> ans= new ArrayList<>();
        for(int i=1;i<result.length;i++){
            if(end>=result[i][0]){
                start=Math.min(start,result[i][0]);
                end=Math.max(end,result[i][1]);
            }
            else{
                ans.add(new int[]{start,end});
                start=result[i][0];
                end=result[i][1];
            }
        }
        ans.add(new int[]{start,end});
        int[][] answer= ans.toArray(new int[ans.size()][]);
        return answer;
    }
}