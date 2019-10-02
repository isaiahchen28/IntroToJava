// in place sorting
public class Sort
{
	public static void insertionSort(double[] array)
	{
		for (int sortedsize = 1 ; sortedsize < array.length ; sortedsize++)
		{
			int index = sortedsize;
			double firstUnsortedValue = array[index];
			while (index > 0  &&  array[index-1] > firstUnsortedValue)
			{
			    array[index] = array[index-1];
			    index--;
			}
			array[index] = firstUnsortedValue;
		}
	}

    	public static void printArray(String label, double [ ] array){
          System.out.println("----- " + label);
	  for (int i = 0 ; i < array.length ; i++){
	      System.out.println(array[i]);
	  }
	}


	public static void main(String[] args)
	{
		double[] xyz = { 334.2, 43.4, -28.3, 79.8, 38.2 };
		insertionSort(xyz);
		printArray("insertion sort", xyz);
	}
}
