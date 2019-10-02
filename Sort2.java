//  in-place selection sort, very simple
public class Sort2{
    public static void selectionSort(double[] array){
	for (int firstUnsorted = 0 ; 
	     firstUnsorted < array.length-1 ; 
	     firstUnsorted++){
	    swap(array, 
		 firstUnsorted, 
		 indexOfSmallest(array, firstUnsorted));
	}
    }
    // return index of element in array with smallest contents in range start
    //  thru last index
    public static int indexOfSmallest(double[] array, int start){
	int indexOfSmall = start;
	for (int index = start+1; index < array.length; index++){				
	    if (array[index] < array[indexOfSmall]) {
		indexOfSmall = index;
	    }
	}
	return indexOfSmall;
    }
    // swap element i and j of array
    public static void swap(double [] array, int i, int j){
	double temp = array[i];
	array[i] = array[j];
	array[j] = temp;
    }
    
    public static void printArray(String label, double [ ] array){
	System.out.println("----- " + label);
	for (int i = 0 ; i < array.length ; i++){
	    System.out.println(array[i]);
	}
    }

    public static void main(String[] args){
	double[] xyw = { 334.2, 43.4, -28.3, 79.8, 38.2 };
	selectionSort(xyw);
	printArray("selection sort", xyw);
    }
}
