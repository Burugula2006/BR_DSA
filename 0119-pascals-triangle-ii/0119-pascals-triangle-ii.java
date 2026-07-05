class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> al = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> row= new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i )row.add(1);
                else row.add(al.get(j)+al.get(j-1));
            }
        al=row;
        }
        return al;
    }
}