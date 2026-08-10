// Last updated: 10/08/2026, 13:42:08
1class Solution {
2    public boolean isPalindrome(String s) {
3        int i=0,j=s.length()-1;
4        while(i<j){
5            while(i<j&&!Character.isLetterOrDigit(s.charAt(i))) i++;
6            while(i<j&&!Character.isLetterOrDigit(s.charAt(j))) j--;
7            if(Character.toLowerCase(s.charAt(i++))!=Character.toLowerCase(s.charAt(j--))) return false;
8        }
9        return true;
10    }
11}