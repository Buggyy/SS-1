/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s.s.po1;

import java.util.ArrayList;

/**
 * Description: How we implement a student list containing studentnumbers and
 * student grades: By adding a student to the BST we use the student's grade to
 * determine the key of the node. The studentnumber is the value of that node.
 * Students with the same grade get added to the value (arraylist) of that
 * specific node.
 *
 * @author Stefan Lobato [IS204] 500707274
 * @param <Key>
 * @param <Value>
 */
public class BST<Key extends Comparable<Key>, Value> {

    private Node root; // root of BST

    private class Node {

        // key, (cijfer)
        private Key key;

        // associated value, (studentnummers)
        private Value val;
        ArrayList<Integer> studentNumbers;

        private int size = 0;
        // links to subtrees
        private Node left, right;
        // # nodes in subtree rooted here
        private int N;

        public Node(Key key, Value val, int N) {
            this.key = key;
            this.val = val;

            //  Create arraylist when Node is created
            this.studentNumbers = new ArrayList();

            //  Add value to ArrayList
            studentNumbers.add((Integer) val);

            this.N = N;
        }
    }

    /**
     *
     * @return
     */
    public int size() {
        return size(root);
    }

    private int size(Node x) {
        if (x == null) {
            return 0;
        } else {
            return x.N;
        }
    }

    /**
     *
     * @param key
     * @return
     */
    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node x, Key key) {
        // Return value associated with key in the subtree rooted at x;
        // return null if key not present in subtree rooted at x.
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return get(x.left, key);
        } else if (cmp > 0) {
            return get(x.right, key);
        } else {
            return x.val;
        }
    }

    /**
     *
     * @param key
     * @param val
     */
    public void put(Key key, Value val) {
        // Search for key. Update value if found; grow table if new.
        root = put(root, key, val);
    }

    private Node put(Node x, Key key, Value val) {
        // Change key’s value to val if key in subtree rooted at x.
        // Otherwise, add new node to subtree associating key with val.
        if (x == null) {
            return new Node(key, val, 1);
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = put(x.left, key, val);
        } else if (cmp > 0) {
            x.right = put(x.right, key, val);
        } else {
            //  put studentnumber in Arraylist
            x.studentNumbers.add((Integer) val);

        }
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }

    /**
     *
     * @param key
     * @return
     */
    public int rank(Key key) {
        return rank(key, root);
    }

    private int rank(Key key, Node x) {
        // Return number of keys less than x.key in the subtree rooted at x.
        if (x == null) {
            return 0;
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return rank(key, x.left);
        } else if (cmp > 0) {
            return 1 + size(x.left) + rank(key, x.right);
        } else {
            return size(x.left);
        }
    }

}
