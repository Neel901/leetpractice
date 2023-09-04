class Solution {
    public String breakPalindrome(String palindrome) {
        char[] pal=palindrome.toCharArray();
        if (palindrome.length() == 1) {
            return "";
        }
        else {
            for (int i = 0; i < (palindrome.length()) / 2; i++) {
                if (pal[i] > 'a') {
                    pal[i] = 'a';
                    break;
                }
                if(pal[i]=='a'&&i==((palindrome.length()) / 2)-1){
                    pal[(palindrome.length())-1]='b';
                    break;
                }
            }
        }
        String lap=new String(pal);
        return lap;
    }
}