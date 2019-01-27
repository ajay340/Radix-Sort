package Radix_Sort;

public class RadixSort {

	//purpose: to use the auxiliary functions to sort the vector.
	public static Integer[] radixSort(Integer[] input) {
		IBuckets<Integer> B = new Buckets<Integer>(20);
		//Purpose: Counts which digit is currently being bucketized with.
		int ctr = 0;
		//Purpose: The number of digits in the highest magnitude number.
		//Effect: Sorts the array
		int max  = findMax(findLongest(input));
		//INV: CTR <= max && CTR++
		while(ctr <= max){//CTR <= max
			Bucketize(input, B, ctr);//Input, B, CTR++
			B.debucketize(input);//B -> input
			ctr++;//CTR = CTR + 1
		}
		return input;
		//Termination Argument: returns the array sorted after CTR is equal or above the max
		//CTR >= max

	}

	// Purpose: to output the maximum value in the given array
	public static Integer findLongest(Integer[] A) {
		// Max = max number in given array
		int max = 0;
		int index = 0;
		//Purpose: findest the biggest number in the the array
		//Effect: returns the biggest number
		//Accum INV: index <= A.length && A[index] > max
		while (index < A.length) {//index < A.[index...length-1]
			if (Math.abs(A[index]) > max) { //|A[index]| > max && A[index] > max
				max = A[index]; //max == A[index]
				index++; //index  ==  index + 1
			} else { //index == index
				index++; //index = index + 1
			}
		}
		return max;
		// Termination Argument: Each time the function loops, it checks whether the index is less than the length of A.
		// If it is, the function loops and increments the index by 1. If the index is not less than the length of A,
		// the function terminates.
		//index >= A.length
	}

	// Purpose: to find the number of digits in the given number
	public static Integer findMax(int input) {
		int exp = 1;
		int temp = (int) (input % (Math.pow(10, exp)));
		//Purpose: to determine the input's number of digits
		//Effect: keep finding dividing by 10 until it has a counter of how many digits
		//Accum INV: index != temp
		while (input != temp) {//input != temp && exp > 0 && temp = (input % (Math.pow(10, exp)))
			exp++; //exp = exp + 1
			temp = (int) (input % (Math.pow(10, exp))); //temp = (input % (Math.pow(10, (exp + 1))))
		}
		//Termination Argument: When the temporary value no longer equals the inputs after recursively taking the remainder to the power of 10
		//temp = input
		return (exp);
	}

	// Purpose: puts the numbers in their precise buckets and sorts the buckets
	public static Integer[] Bucketize(Integer[] v, IBuckets<Integer> B, int ctr) {
		int index = 0;
		//Purpose: Places the values of the index of the array in the specified bucket
		//Effect: puts all items in the array in a sorted list of buckets
		//Accum INV: index <= v.length--
		while (index <= v.length - 1) {//index <= v.length--
			int current = v[index];//current == v[index]
			int digit = (int) ((current % (Math.pow(10, ctr + 1))) / (Math.pow(10, ctr)));
			//digit == current % (Math.pow(10, ctr + 1))) / (Math.pow(10, ctr)
						
			B.add(current, digit + 9); //v[index] = digit + 9
			// the intention of this function is to take our digit and add 9 to it, then add the
			// current. This is done so that our list of buckets starts at -9, then 9 is added taking it to zero, and lastly the current is added
			// taking it to the bucket it needs in the list whether +/- from zero.
			index++; //index = index + 1
		

		}
		//Termination Argument: This function is counting for exp <= length. Calls the helper function.
		//index > v.length - 1
		return v;
	}

}
