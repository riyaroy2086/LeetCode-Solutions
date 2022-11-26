// https://leetcode.com/submissions/detail/850242101/

class Solution {
     public String addStrings(String num1, String num2) {
//         int n1 = Integer.parseInt(num1);
//         int n2 = Integer.parseInt(num2);
        
//         int sum = n1+n2;
//         return String.valueOf(sum);
         
//-----------------------------------------------------------------------
    
// Using StringBuilder
         
         StringBuilder sb = new StringBuilder();
         int carry =0,i=num1.length()-1,j=num2.length()-1;
         while(i>=0 || j>=0 || carry >0){
             if(i>=0){
                 carry += num1.charAt(i--)-'0';
             }
             if(j>=0){
                 carry += num2.charAt(j--)-'0';
             }
             sb.append(carry%10);
             carry/=10;
         }
         return sb.reverse().toString();
    }
}
