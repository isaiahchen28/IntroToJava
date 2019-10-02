// two-array (ie not in-place) sorting
public class SortNIP{
    public static double [ ] insertionSort(double[ ] unsorted){
	double [ ] sorted = new double [unsorted.length];
	for (int numSorted = 0;	// number of numbers transferred
	     //                    to sorted.  Also index in unsorted
	     //                    of number we are currently 
	     //                    transferring
	     numSorted < unsorted.length;
	     numSorted++){
            int i;
            for (i=numSorted-1; // last in-use index of sorted
		 i>=0 && sorted[i] > unsorted[numSorted]; 
		 i--){
                sorted[i+1] = sorted[i];
            }
	    // insert number after index i. To insert at front of
	    // an array (index 0), use i = -1
            sorted[i+1] = unsorted[numSorted];
	}
	return sorted;
    }
	
    public static double [ ] selectionSort(double[] unsorted){
	double [ ] sorted = new double [unsorted.length];
	int numUnsorted = unsorted.length; // number of in-use elements
	//                                    of unsorted
	for (int numSorted = 0; // number of numbers transferred
	     //                    to sorted. Also index in sorted
	     //                    where next number goes
	     numSorted < unsorted.length; 
	     numSorted++){
	    //   One "pass" of the algorithm one time though the body of the
	    //   outer loop (the for(int numesorted ...) loop)
	    int indexOfSmallest = 0;
	    for (int place = 1; place < numUnsorted; place++){
		if (unsorted[place] < unsorted[indexOfSmallest]){
		    indexOfSmallest = place;
		}
	    }
	    // add smallest in unsorted to end of sorted
	    sorted[numSorted] = unsorted[indexOfSmallest];
	    // delete smallest from unsorted
	    unsorted[indexOfSmallest] = unsorted[numUnsorted-1];
	    numUnsorted--;
	}
	return sorted;
    }

    public static void printArray(String label, double [ ] array){
        System.out.println("----- " + label);
	for (int i = 0 ; i < array.length ; i++){
	    System.out.println(array[i]);
	}
    }
    
    public static void main(String[] args)
    {
	double[ ] xyz = { 334.2, 43.4, -28.3, 79.8, 38.2 };
	double [ ] sorted = insertionSort(xyz);
	printArray("insertion sort", sorted);
	
	double [ ] xyw = { 334.2, 43.4, -28.3, 79.8, 38.2 };
	sorted = selectionSort(xyw);

	printArray("selection sort", sorted);
    }
}
