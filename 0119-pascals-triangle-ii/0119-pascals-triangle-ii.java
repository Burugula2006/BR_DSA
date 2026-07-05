class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> al= new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> row= new ArrayList<Integer>();
                row.add(1);
            for(int j=1;j<i;j++){
                row.add(al.get(i-1).get(j-1)+al.get(i-1).get(j));
            }
           if(i!=0) row.add(1);
            al.add(row);
        }
        return al.get(rowIndex);
    }
}