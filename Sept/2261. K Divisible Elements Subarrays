//https://leetcode.com/submissions/detail/793206474/

class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        // at most k upon p
        // distinct -> HashSet with StringBuilder or Hashing
        
        // SB
        // create a StringBuilder object
        // with a String pass as parameter
//         StringBuilder str
//             = new StringBuilder("AAAABBBCCCC");
 
//         // print string
//         System.out.println("String = "
//                            + str.toString());
 
//         // reverse the string
//         StringBuilder reverseStr = str.reverse();
 
//         // print string
//         System.out.println("Reverse String = "
//                            + reverseStr.toString());
 
//         // Append ', '(44) to the String
//         str.appendCodePoint(44);
 
//         // Print the modified String
//         System.out.println("Modified StringBuilder = "
//                            + str);
 
//         // get capacity
//         int capacity = str.capacity();
 
//         // print the result
//         System.out.println("StringBuilder = " + str);
//         System.out.println("Capacity of StringBuilder = "
//                            + capacity);
        
//      -----------------------------------------------
        int n= nums.length;
       
        //using StringBuilder here to remove duplication
        HashSet<String> h = new HashSet<>();
        for(int i=0;i<n;i++){
            int c=0;
            StringBuilder b = new StringBuilder();
            for(int j=i;j<n;j++){
                // div by p
                if(nums[j] %p==0)c++;
                // atmost k
                if(c>k) break;
                // appending and removing duplicates
                b.append(nums[j]+'_');
                //printing
                h.add(b.toString());
            }
        }return h.size();
    }
}
