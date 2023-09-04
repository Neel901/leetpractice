class Solution {
    public int num(char s){
        if(s=='I')return 1;
        else if(s=='V')return 5;
        else if(s=='X')return  10;
        else if(s=='L')return 50;
        else if(s=='C')return 100;
        else if(s=='D')return 500;
        else if(s=='M')return 1000;
        return 0;
    }
    public int romanToInt(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            if(i!=n-1 && num(s.charAt(i+1))>num(s.charAt(i))){
                sum=sum+(num(s.charAt(i+1))-num(s.charAt(i)));
                i++;
            }
            else{
                sum=sum+num(s.charAt(i));
            }
        }
        return sum;
    }
}