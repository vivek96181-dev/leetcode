class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> openStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                openStack.push(i);
            } 
            else if (ch == '*') {
                starStack.push(i);
            } 
            else {
                // Match ')' with '(' first
                if (!openStack.isEmpty()) {
                    openStack.pop();
                } 
                // Otherwise, use '*' as '('
                else if (!starStack.isEmpty()) {
                    starStack.pop();
                } 
                else {
                    return false;
                }
            }
        }

        // Match remaining '(' with '*' occurring after it
        while (!openStack.isEmpty() && !starStack.isEmpty()) {
            if (openStack.peek() < starStack.peek()) {
                openStack.pop();
                starStack.pop();
            } else {
                return false;
            }
        }

        return openStack.isEmpty();
    }
}
