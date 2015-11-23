/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

import nl.hva.dmci.ict.inf.ads.lib.StdOut;

/**
 *
 * @author Omer
 */
public class Sorter {

    private Comparable[] aux;      // auxiliary array for merges

    /**
     * 
     * @param a 
     */
    public static void quickSort(Comparable[] a) {
        Quick.sort(a);
    }
    
    /**
     * 
     * @param a 
     */
    public static void quickSort3Way(Comparable[] a) {
        Quick3way.sort(a, 0, a.length - 1);
    }

    public static int partition(Comparable[] a, int lo, int hi) {

        // Partition into a[lo..i-1], a[i], a[i+1..hi].
        int i = lo, j = hi + 1;          // left and right scan indices
        Comparable v = a[lo];            // partitioning item

        while (true) {
            // Scan right, scan left, check for scan complete, and exchange.
            while (less(a[++i], v)) {
                if (i == hi) {
                    break;
                }
            }
            while (less(v, a[--j])) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exch(a, i, j);

        }

        exch(a, lo, j);     // Put v = a[j] into position
        return j;           // with a[lo..j-1] <= a[j] <= a[j+1..hi].

    }

    public static void mergeSort(Comparable[] a) {
        Comparable[] tmp = new Comparable[a.length];
        // merge(a, tmp, 0, a.length - 1);
    }

    public void merge(Comparable[] a, int lo, int mid, int hi) {

        // Merge a[lo..mid] with a[mid+1..hi].
        int i = lo, j = mid + 1;

        for (int k = lo; k <= hi; k++) // Copy a[lo..hi] to aux[lo..hi].
        {
            aux[k] = a[k];
        }

        for (int k = lo; k <= hi; k++) // Merge back to a[lo..hi].
        {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }

    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a) {  // Print the array, on a single line.
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a) {  // Test whether the array entries are in order.
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    private class Merge {

        // private Comparable[] aux;      // auxiliary array for merges
        public void sort(Comparable[] a) {
            aux = new Comparable[a.length];    // Allocate space just once.
            sort(a, 0, a.length - 1);
        }

        private void sort(Comparable[] a, int lo, int hi) {  // Sort a[lo..hi].
            if (hi <= lo) {
                return;
            }
            int mid = lo + (hi - lo) / 2;
            sort(a, lo, mid);       // Sort left half.
            sort(a, mid + 1, hi);     // Sort right half.
            merge(a, lo, mid, hi);  // Merge results (code on page 271).
        }

    }

}
