class Solution {
    public static String reverseString(String s) {
        // code here
        String res = " ";
        for(int i=s.length()-1; i>=0; i--){
            res = res + s.charAt(i);
        }
        return res;
    }
}

