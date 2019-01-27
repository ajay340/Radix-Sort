package Radix_Sort;

public interface IBucket<X> {
	// Purpose: To add the given element to this bucket
	// Effect: The bucket has the given element as its last element added
	public void add(X element);

	// Purpose: Place bucket elements into the given array starting at index i
	// Effect: Clears the bucket
	public int toArray(X[] A, int i);

	// Purpose: returns the size of the bucket.
	public int size();

}
