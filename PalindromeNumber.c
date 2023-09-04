#include <stdbool.h>
bool isPalindrome(long long int x){
    long long int r, N=0;
    long long int realN = x;
    if(x<0){
        return false;
    }
    
    
    
    while (x != 0) {
        r = x % 10;
        N = N * 10 + r;
        x /= 10;
    }
    if(realN==N){
        return true;
    }
    else{
        return false;
    }
    
}