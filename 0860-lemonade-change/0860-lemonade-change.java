class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        int twenty=0;
        for(int i:bills){
            if(i==5){
                five++;
                
            }
            else if(i==10){
                ten++;
               if(five>=1) five--;
               else return false;
            }
            else{
                if(five>=3 && ten==0){
                    five=five-3;
                }
                else{
                    if(ten>=1 && five>=1 ){
                        ten=ten-1;
                        five=five-1;
                    }
                    else{
                        return false;
                    }
                }
            }

        }
        return true;
    }
}