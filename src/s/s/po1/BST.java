/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s.s.po1;

import java.util.ArrayList;

/**
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
        //  private Value val; 
         ArrayList<Integer> studentNumbers = new ArrayList();
        
        private int size = 0;
        // links to subtrees
        private Node left, right;
        // # nodes in subtree rooted here
        private int N; 

        public Node(Key key, int N) {
           this.key = key;
           //   this.val = val;
           this.studentNumbers = studentNumbers;
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
            // return x.val;
            return (Value) x.studentNumbers;
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
//            return new Node(key, val, 1);
        return new Node(key, 1);
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = put(x.left, key, val);
        } else if (cmp > 0) {
            x.right = put(x.right, key, val);
        } else {
            //  x.val = val;
            //  put studentnumber in Arraylist
            
            // Code..
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
