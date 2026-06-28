class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int n=words.length;
        List<String> al = new ArrayList<String>();
        for(String s:words){
            //if(s.length()!=pattern.length())continue;
            //abc
            HashMap<Character,Character> hm1 = new HashMap<>();
            HashMap<Character,Character> hm2 = new HashMap<>();
            boolean flag=true;
            for(int i=0;i<s.length();i++){
                if(hm1.containsKey(s.charAt(i))){
                    if(hm1.get(s.charAt(i))!=pattern.charAt(i)){
                        flag=false;
                        break;
                    }
                }
                else{
                    hm1.put(s.charAt(i),pattern.charAt(i));
                }


                if(hm2.containsKey(pattern.charAt(i))){
                    if(hm2.get(pattern.charAt(i))!=s.charAt(i)){
                        flag=false;
                        break;
                    }
                }
                else{
                    hm2.put(pattern.charAt(i),s.charAt(i));
                }
            }

            if(flag)al.add(s);

        }
        return al;
    }
}