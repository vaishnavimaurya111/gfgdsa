class Solution {
    public String reverseWords(String s) {
         
        Stack<String> stack = new Stack<>();
        String[] parts = s.split("\\.");
        
        for (String word : parts) {
            if (!word.isEmpty()) {
                stack.push(word);
            }
        }
        
        
      StringBuilder result = new StringBuilder();


         while (!stack.isEmpty()) {
            result.append(stack.pop());
            if (!stack.isEmpty()) {
                result.append(".");
            }
        }return result.toString();
}}

