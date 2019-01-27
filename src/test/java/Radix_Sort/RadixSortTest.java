package Radix_Sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class RadixSortTest {

    @Test
    public void test() {
        Integer T = new Integer(3);
        Integer I = new Integer(1000);
        Integer L = new Integer(-80);
        Integer[] A = {1,2,3};
        Integer[] B = {4, 9, 3};
        Integer[] C = {-3, -6, -1};
        Integer[] D = {-7, 0, 5};

        assertEquals(RadixSort.findLongest(A).intValue(), 3);
        assertEquals(RadixSort.findLongest(B).intValue(), 9);
        assertEquals(RadixSort.findLongest(C).intValue(), -1);
        assertEquals(RadixSort.findLongest(D).intValue(), 5);
        assertEquals(RadixSort.findMax(T).intValue(), 1);
        assertEquals(RadixSort.findMax(I).intValue(), 4);
        assertEquals(RadixSort.findMax(L).intValue(), 2);
    }
}
