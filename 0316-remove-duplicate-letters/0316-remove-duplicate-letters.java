
class Solution {
    public String removeDuplicateLetters(String s) {

        int[] freq = new int[26];
        boolean[] visited = new boolean[26];

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            freq[c - 'a']--;

            // Skip if already present
            if (visited[c - 'a']) {
                continue;
            }

            // Remove larger characters if they appear again later
            while (!stack.isEmpty()
                    && stack.peek() > c
                    && freq[stack.peek() - 'a'] > 0) {

                char removed = stack.pop();
                visited[removed - 'a'] = false;
            }

            stack.push(c);
            visited[c - 'a'] = true;
        }

        // Build final answer
        StringBuilder result = new StringBuilder();

        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}
