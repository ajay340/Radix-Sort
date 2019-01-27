package Radix_Sort;

import java.util.*;

public class Buckets<X> implements IBuckets<X> {

	// Purpose: to create a new ArrayList
	private List<IBucket<X>> B;

	//Purpose: Creates a new array list of Buckets with the given number of buckets.
	//Effect: adds new bucket(s) to the Buckets list.
	//Assumption: Size == size need for bucket array
	public Buckets(int size) {
		B = new ArrayList<IBucket<X>>(); //Purpose: Creates the array list to be an IBucket
		int i = 0; // Purpose: counter for the while loop.
		//Inv: I < size && i++ < size
		while (i < size) {// i < size
			B.add(new Bucket<X>());//i < size
			i = i + 1;
			// Invariant: i = i + 1 && i + 1 < size
		}
		// Termination Argument: Each time the function loops, it compares the number of buckets to the given integer.
		// If the number of buckets is less than the integer, the function passes again and adds another bucket.
		// Once the number of buckets reaches the number given, the function terminates.

	}

	public void add(X elem, int i) {
		//Get the bucket at the ith index then add to that bucket
		B.get(i).add(elem);
	}

	//purpose: To take the sorted buckets and put them into an array
	public void debucketize(X[] v) {
		int CTR = 0; // start the counter at 0
		int i = 0; // Purpose: start the index at 0
		// Accum Inv: CTR  < 19
		// Assumption: the array is not empty to debucketize
		while (CTR < 19) { // CTR < 19 
			i += B.get(CTR).toArray(v, i); // i == B[CTR] && v[i] == B[CTR]
			CTR++; // CTR = CTR + 1
		}
		// Termination Argument: Each time the function loops, it checks whether the counter is under 19 or not. If the
		// counter is under 19, it passes the bucket into the array and increments the counter by one. Once the couter
		// reaches 19, the function terminates.

	}
}
