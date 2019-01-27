package Radix_Sort;

public interface IBuckets<X> {
	// Purpose: to add the given element to the bucket at the given index
	public void add(X elem, int i);

	// Purpose: to put all elements of the bucket back into the array
	public void debucketize(X[] v);
}
