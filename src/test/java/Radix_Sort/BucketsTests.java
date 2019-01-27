package Radix_Sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class BucketsTests {
	Integer one = new Integer(1);
	Integer two = new Integer(2);
	Integer three = new Integer(3);
	Integer forty = new Integer(43);
	Integer onehundresom = new Integer(157);
	Integer fourhundredsom = new Integer(401);
	Integer fivehundredsom = new Integer(594);
	Integer sevenhundredsom = new Integer(748);
	Integer threethousom = new Integer(3999);
	Integer fourthousom = new Integer(4928);
	Integer Nfour = new Integer(-4);
	Integer Nnine = new Integer(-9);
	Integer Nfourhundredsom = new Integer(-493);
	Integer[] test1 = {Nfourhundredsom, Nnine, Nfour, one, two, three, forty, onehundresom, fourhundredsom, fivehundredsom, sevenhundredsom, threethousom, fourthousom};
	Integer[] test2 = {two, one, three, threethousom, forty, onehundresom, fourthousom, fourhundredsom, fivehundredsom, sevenhundredsom, Nfour, Nnine, Nfourhundredsom};
	Integer[] test3 = {sevenhundredsom, threethousom, forty};  
	Integer[] empty = {};
	
	 
	@Test
	public void test() {
		RadixSort.radixSort(empty);
		assertArrayEquals(empty, empty);
		RadixSort.radixSort(test2);
		assertArrayEquals(test1, test2);
	
	}
}
	