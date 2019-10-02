
public class Heap {

    public Heap() {
        this.array = new int[0]; // defines an empty array
    }

    public int getSize() {
        return array.length; // returns the number of elements in the heap
    }

    public void printHeap() {   //print the heap
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public void addElement(int element) {
        
        // the following lines add the new element to the end of the heap(array)
        int[] tmpArr = new int[array.length + 1];  
        System.arraycopy(array, 0, tmpArr, 0, array.length);
        tmpArr[array.length] = element;
        array = tmpArr;
        int i = array.length - 1;
        while (i > 0) {  // keep doing this until you see the root
            if (array[i] > array[(i - 1) / 2]) { // check if the value of the child is more than its parent
                int tmp = array[i];  // swap the contents of the child andd its parent
                array[i] = array[(i - 1) / 2];
                array[(i - 1) / 2] = tmp;
            }
            i = (i - 1) / 2;
        }
    }

    public int removeElement() {
        int result = array[0]; 
        array[0] = array[array.length - 1]; // for creating a new array which has size-1
        int[] tmpArr = new int[array.length - 1];
        System.arraycopy(array, 0, tmpArr, 0, array.length - 1);
        array = tmpArr;

        int i = 0;
        while (true) {
            if ((2 * i + 1) < array.length && (array[2 * i + 1] > array[i])) {
                int tmp = array[i];
                array[i] = array[2 * i + 1];
                array[2 * i + 1] = tmp;
                i = 2 * i + 1;
            } else if ((2 * i + 2) < array.length && (array[2 * i + 1] < array[2 * i + 2])) {
                int tmp = array[i];
                array[i] = array[2 * i + 2];
                array[2 * i + 2] = tmp;
                i = 2 * i + 2;
            } else {
                break;
            }
        }
        return result;
    }


    private int[] array;
}
