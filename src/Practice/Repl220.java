package Practice;

public class Repl220 {

    // Trie node (considering only lowercase alphabets)
    static class Node
    {
        Node[] arr = new Node[26];
        int freq;
    };

    // Function to insert a node in the trie
    static Node insert(String s, Node root)
    {
        int in;
        Node cur = root;
        for (int i = 0; i < s.length(); i++)
        {
            in = s.charAt(i) - 'a';

            // If there is no node created then create one
            if (cur.arr[in] == null)
                cur.arr[in] = new Node();

            // Increase the frequency of the node
            cur.arr[in].freq++;

            // Move to the next node
            cur = cur.arr[in];
        }

        // Return the updated root
        return root;
    }

    // Function to return the count of Strings
    // whose prefix of length k matches with the
    // k length prefix of the given String
    static int find(String s, int k, Node root)
    {
        int in, count = 0;
        Node cur = root;

        // Traverse the String
        for (int i = 0; i < s.length(); i++)
        {
            in = s.charAt(i) - 'a';

            // If there is no node then return 0
            if (cur.arr[in] == null)
                return 0;

            // Else traverse to the required node
            cur = cur.arr[in];

            count++;

            // Return the required count
            if (count == k)
                return cur.freq;
        }
        return 0;
    }

    // Driver code
    public static void main(String[] args)
    {
        String arr[] = { "steve","stevens","danny","steves","dan","john","johny"
                ,"joe"
                ,"alex"
                ,"alexander" };
        int n = arr.length;

        Node root = new Node();

        // Insert the Strings in the trie
        for (int i = 0; i < n; i++)
            root = insert(arr[i], root);

        // Query 1
        System.out.print(find("steve", 2, root) + "\n");

       /* // Query 2
        System.out.print(find("abg", 2, root) + "\n");

        // Query 3
        System.out.print(find("xyz", 2, root) + "\n");*/

    }
}
