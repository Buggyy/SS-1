/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

import nl.hva.dmci.ict.inf.ads.lib.StdRandom;

/**
 * Median-of-three partitioning included
 *
 * @author Ömer Zülaloğlu [IS204] 500712124 & Stefan Lobato [IS204] 500707274
 */
public class Quick {

    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a);          // Eliminate dependence on input.
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int j = Sorter.partition(a, lo, hi);  // Partition (see page 291).
        sort(a, lo, j - 1);              // Sort left part a[lo .. j-1].
        sort(a, j + 1, hi);              // Sort right part a[j+1 .. hi].
    }


}
