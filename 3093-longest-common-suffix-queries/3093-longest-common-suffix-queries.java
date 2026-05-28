class Solution {

    class TrieNode {
        TrieNode[] child = new TrieNode[26];

        int index;
        int len;

        TrieNode(int index, int len) {
            this.index = index;
            this.len = len;
        }
    }

    TrieNode root;

    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {

        int n = wordsContainer.length;

        int minLen = Integer.MAX_VALUE;
        int minIdx = 0;

        // Find globally shortest word
        for (int i = 0; i < n; i++) {
            if (wordsContainer[i].length() < minLen) {
                minLen = wordsContainer[i].length();
                minIdx = i;
            }
        }

        root = new TrieNode(minIdx, minLen);

        // Insert reversed words
        for (int i = 0; i < n; i++) {
            insert(wordsContainer[i], i);
        }

        int[] ans = new int[wordsQuery.length];

        for (int i = 0; i < wordsQuery.length; i++) {
            ans[i] = search(wordsQuery[i]);
        }

        return ans;
    }

    private void insert(String word, int idx) {

        TrieNode node = root;
        int len = word.length();

        // reverse traversal
        for (int i = len - 1; i >= 0; i--) {

            int c = word.charAt(i) - 'a';

            if (node.child[c] == null) {
                node.child[c] = new TrieNode(idx, len);
            }

            node = node.child[c];

            // update best answer at node
            if (len < node.len) {
                node.len = len;
                node.index = idx;
            }
        }
    }

    private int search(String word) {

        TrieNode node = root;

        for (int i = word.length() - 1; i >= 0; i--) {

            int c = word.charAt(i) - 'a';

            if (node.child[c] == null) {
                break;
            }

            node = node.child[c];
        }

        return node.index;
    }
}