class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int start=0;
        int end=n-1;
        int area=0;
        int max_area=0;
        while(start<end){
            int width=end-start;
            int ht=Math.min(height[start],height[end]);
            area=width*ht;
            max_area=Math.max(max_area,area);
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }
        return max_area;
    }
}