// https://leetcode.com/problems/palindrome-number/class Solution {
// time complexity = O(N).
// space complexity = 1;

    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int temp = x;
        int pal = 0;
        while(temp > 0){
            pal = pal * 10;
            pal = pal + temp%10;
            temp = temp / 10;
        }
        if(pal == x) return true;
        return false;
    }
}
