class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String, Node> hm = new HashMap<>();
        HashMap<String, Node> hm1 = new HashMap<>();
        int res = 0;

        for (String s : words) {
            String rev = "" + s.charAt(1) + s.charAt(0);

            if (s.equals(rev)) {
                Node node = hm1.getOrDefault(s, new Node(0, 0));
                if (node.b < node.a) {
                    node.b++;
                } else {
                    node.a++;
                }
                hm1.put(s, node);
            } else if (hm.containsKey(rev) && hm.get(rev).b < hm.get(rev).a) {
                Node node = hm.get(rev);
                node.b++;
                hm.put(rev, node);
            } else {
                Node node = hm.getOrDefault(s, new Node(0, 0));
                node.a++;
                hm.put(s, node);
            }
        }

        // For non-palindromic words
        for (Node n : hm.values()) {
            res += n.b * 4;
        }

        // For palindromic words
        int temp = 0, temp1 = 0;
        for (Node n : hm1.values()) {
            res += n.b * 4;
            temp += n.a;
            temp1 += n.b;
        }

        // Add a central palindrome if possible
        if (temp - temp1 > 0) {
            res += 2;
        }

        return res;
    }
}

class Node {
    int a, b;
    Node(int a, int b) {
        this.a = a; // Total occurrences
        this.b = b; // Used pairs
    }

 
}
