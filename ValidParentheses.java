class Solution {
    public char[] n =new  char[10000];
    public int top=-1;
    void push(char i){
        top++;
        n[top]=i;
    }
    char pop(){
        return n[top--];
    }
    public boolean isValid(String s) {
        int N=s.length();
        if(N<2)return false;
        //if(s.charAt(0)==')'||s.charAt(0)=='}'||s.charAt(0)==']')return false;
	    int i,n1=0,n2=0,n3=0,n4=0,n5=0,n6=0;
        for(i=0;i<N;i++){
            if(s.charAt(i)=='(')n1++;
            else if(s.charAt(i)==')')n2++;
            else if(s.charAt(i)=='{')n3++;
            else if(s.charAt(i)=='}')n4++;
            else if(s.charAt(i)=='[')n5++;
            else if(s.charAt(i)==']')n6++;
        }
        
        char c;
        for(i=0;i<N;i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                push(s.charAt(i));
            }
            else{
                try{c=pop();}
                catch(Exception e){return false;}
                if((c=='('&&s.charAt(i)!=')')||(c=='{'&&s.charAt(i)!='}')||(c=='['&&s.charAt(i)!=']'))return false;
            }
        }
        if(n1==n2&&n3==n4&&n5==n6)
            return true;
        return false;
    }
}