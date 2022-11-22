// https://leetcode.com/submissions/detail/848038545/

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // recursive call to determin the larger and shoter string 
        if(str1.length() < str2.length())
            return gcdOfStrings(str2,str1);
        // the two strings must start nwith the same chars
        if(!str1.startsWith(str2))
            return "";
        if (str2.isEmpty())
            return str1;

        return gcdOfStrings(str2,mod(str1,str2));
    }
    
    private String mod(String s1,String s2){
        while(s1.startsWith(s2)){
            s1=s1.substring(s2.length());// finding subtring of equal length in s1
            
        }
        return s1;
    }
}
