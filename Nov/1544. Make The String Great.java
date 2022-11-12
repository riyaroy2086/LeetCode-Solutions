// https://leetcode.com/submissions/detail/839673948/

class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            int len = sb.length();
            if(len>0 && Math.abs(s.charAt(i)-sb.charAt(len-1))==32 ){
                sb.setLength(len-1);
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
