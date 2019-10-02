// code for a merge sort
public class MergeSort{
    // sort part of array numbers, the part from index begin through index end
    //    indentLevel is used to produce a pretty output
    // top level call should be mergeSort(array, 0, array.length( )-1, 0)
    public static void mergeSort(int [ ] numbers, int begin, int end, int indentLevel){
	System.out.println(indent(indentLevel)+"ms " + begin + " " + end);
	if (end <= begin) {
	    return;
	} else {
	    printArray(numbers, begin, end, indentLevel);
	    int length1 = (end-begin+1)/2; // length of part 1
	    int begin1 = begin;            // index of start & end of part 1
	    int end1 = begin1+length1-1;
	    int begin2 = end1+1;           // start & end of part 2
	    int end2 = end;
	    // sort the parts
	    mergeSort(numbers, begin1, end1, indentLevel+3); 
	    mergeSort(numbers, begin2, end2, indentLevel+3);

	    // merge the sorted parts
	    
	    // array and index variable for result of merge
	    int [ ] inOrder = new int [end-begin+1];
	    int placeOrder = 0;

	    int place1 = begin1;
	    int place2 = begin2;
	    while (place1 <= end1 && place2 <= end2){
		if (numbers[place1] < numbers[place2]){
		    inOrder[placeOrder] = numbers[place1];
		    place1++;
		} else {
		    inOrder[placeOrder] = numbers[place2];
		    place2++;
		}
		placeOrder++;
	    }
	    // copy the remaining elements to result array
	    if (place1 > end1){
		while(place2 <= end2){
		    inOrder[placeOrder] = numbers[place2];
		    place2++;
		    placeOrder++;
		}
	    } else {
		while(place1 <= end1){
		    inOrder[placeOrder] = numbers[place1];
		    place1++;
		    placeOrder++;
		}
	    }
	    // copy merged result back into numbers
	    placeOrder = 0;
	    for (int place = begin; place <= end; place++){
		numbers[place] = inOrder[placeOrder];
		placeOrder++;
	    }
	    printArray(numbers, begin, end,indentLevel);
	}
    }
    public static String indent(int n){
	String res = "";
	for(int i = 0; i<n; i++){
	    res = res + " ";
	}
	return res;
    }
    public static void printArray(int [ ] a, int begin, int end, int indentLevel){
	System.out.print(indent(indentLevel));
	for(int i = begin; i<= end; i++){
	    System.out.print(a[i]+" ");
	}
	System.out.println ( );
    }
    public static void main(String [ ] args){
	// int nums [ ] = {40, 30, 20, 10};
	int nums [ ] = {44, 33,24, 42,56,23,31, 14};
	printArray(nums, 0, nums.length-1, 0);
	mergeSort(nums, 0, nums.length-1, 0);
	printArray(nums, 0, nums.length-1, 0);
    }

}
