// https://leetcode.com/problems/integer-to-roman/

class Solution {
    public String intToRoman(int num) {
        int[] numbers = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] numbersInRoman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < numbers.length && num > 0; i++){
            while(num >= numbers[i]){
                ans.append(numbersInRoman[i]);
                num -= numbers[i];
            }
        }
        return ans.toString();
    }
}
