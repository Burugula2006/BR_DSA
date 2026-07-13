class Solution {
      static  int mod=1000000007;
    public int countGoodNumbers(long n) {
        // 0-9 even= 5={0,2,4,6,8} =5 occurences on each pos and odd=we shhould place primes={2,3,5,7} =4  ;

    long even=(n+1)/2;
    long odd=n/2;
    
 
    long even_total=f(5,even);
long odd_total=f(4,odd);
    return (int)((even_total*odd_total)%mod);

    }
    public long f(long x,long p){
        long tot=1;
        x=x%mod;
        while(p>0){
            if(p%2==1){
            tot=(tot*x)%mod;
            }
                x=(x*x)%mod;
                p=p/2;
        }
        return tot;
    }
}