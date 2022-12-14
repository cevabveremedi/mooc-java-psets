
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
    }

    public static void sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int indexSmallest = indexOfSmallestFrom(array, i);
            swap(array, i, indexSmallest);
        }
    }

    public static int smallest(int[] array){
        // write your code here
        if(array.length == 0)
            return -1;
        int smallest = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] < smallest)
                smallest = array[i];
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array){
        // write your code here
        if(array.length == 0)
            return -1;
        int smallest = array[0];
        int index = 0;
        for(int i = 1; i < array.length; i++) {
            if(array[i] < smallest) {
                index = i;
                smallest = array[i];
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        if(table.length == 0)
            return -1;
        
        int smallest = table[startIndex];
        int index = startIndex;

        for(int i = startIndex; i < table.length; i++) {
            if(table[i] < smallest) {
                smallest = table[i];
                index = i;
            }
        }

        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        if(index1 == index2)
            return;
        array[index1] += array[index2];
        array[index2] = array[index1] - array[index2];
        array[index1] -= array[index2];
    }
}
