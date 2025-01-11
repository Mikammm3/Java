

// leetcode 208. 实现 Trie (前缀树)
//class Trie {
//    // 多叉链表
//    Trie[] children;
//    boolean isEnd;
//
//    public Trie() {
//        children = new Trie[26];
//        isEnd = false;
//    }
//
//    public void insert(String word) {
//        Trie cur = this;
//        for (int i = 0; i < word.length(); i++) {
//            char ch = word.charAt(i);
//            if (cur.children[ch - 'a'] == null) {
//                cur.children[ch - 'a'] = new Trie();
//            }
//            cur = cur.children[ch - 'a'];
//        }
//        cur.isEnd = true;
//    }
//
//    public boolean search(String word) {
//        Trie cur = this;
//        for (int i = 0; i < word.length(); i++) {
//            char ch = word.charAt(i);
//            if (cur.children[ch - 'a'] == null) {
//                return false;
//            }
//            cur = cur.children[ch - 'a'];
//        }
//        return cur.isEnd == true;
//    }
//
//    public boolean startsWith(String prefix) {
//        Trie cur = this;
//        for (int i = 0; i < prefix.length(); i++) {
//            char ch = prefix.charAt(i);
//            if (cur.children[ch - 'a'] == null) {
//                return false;
//            }
//            cur = cur.children[ch - 'a'];
//        }
//        return true;
//    }
//}