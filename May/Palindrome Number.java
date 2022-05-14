class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        
        int ini = x , reverse = 0, rem;
        
        while(x > 0){
            rem = x % 10;
            reverse = reverse*10 + rem;
            x = x/10;
        }
        return reverse==ini;
        
    }
}

