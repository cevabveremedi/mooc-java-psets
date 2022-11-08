
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        int len = array.length;
        for(int i = 0; i < len -1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[len-1]);
    }
}
