class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq= new int[26];
        int n=text.length();
        for(int i = 0;i<n;i++){
            char c=text.charAt(i);
            freq[c-'a']++;
        }
        int res= Math.min(freq['b'-'a'],Math.min(freq['a'-'a'],Math.min(freq['l'-'a']/2,Math.min(freq['o'-'a']/2,freq['n'-'a']))));
        return res;

    }
}