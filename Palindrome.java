class Solution {
    public boolean isPalindrome(int x) {
       int revno = 0;
       while(x > 0) {
        int digit = x % 10;
        revno = revno*10 + digit;
        x = x / 10;
       } 
       return revno == org;
    }
}
