// Reads names and inserts them into an array in alphabetical order
public class InsertInOrderA{

    public static final int MAXNAMES = 10;

    public static void main(String[ ] args){
        //read data into array names until sentinel of
	// empty string, keeping names in alphabetical order
        String[ ] names = new String[MAXNAMES];
        int nextPlace = 0;  // index of first not-in-use element
	//                     of names. Also number of in-use
	//                     elements
        String name = IO.readString( );
        while (name.length( )>0){
            // move names (that should be after name) to make a place for new name
            int i;
            for (i=nextPlace-1; // nextPlace-1 is last in-use index
		 i>=0 && names[i].compareTo(name) > 0; 
		 i--){
                names[i+1] = names[i];
            }
	    // insert name after index i.  
	    //  i == -1 means name goes at front
            names[i+1] = name;
            nextPlace++;	// since names[nextPlace] is 
	    //                     now in use
            printArray(names, nextPlace);
            name = IO.readString( );
        }
        // nextPlace-1 is last in-use index 
        System.out.println(" ");
        for(int i=0; i<nextPlace; i++){ 
            System.out.println(i + "  " + names[i]);
        }
    }

    public static void printArray(String [ ] ary, int next){
      System.out.println("");
      System.out.println("--- ");
      for(int j = 0; j<next; j++){ 
        System.out.println(j + "  " +ary[j]);
      }
      System.out.println("---");
      System.out.println("");
    }
}
