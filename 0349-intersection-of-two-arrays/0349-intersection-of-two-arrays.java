class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set_one=new HashSet<>();
        HashSet<Integer> set_two=new HashSet<>();

        for(int num:nums1){
            set_one.add(num);
        }

        for(int numb:nums2){
            if(set_one.contains(numb)){
                set_two.add(numb);
            }
        }

        int arr[]=new int[set_two.size()];
        int index=0;
        for(int number:set_two){
            arr[index++]=number;
        }
        return arr;
        
    }
}