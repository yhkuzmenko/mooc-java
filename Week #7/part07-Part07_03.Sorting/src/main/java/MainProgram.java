import java.util.Arrays;

public class MainProgram {

    public static int smallest(int[] array) {
        int smallestNumber = array[0];

        for (int number : array) {
            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }

        return smallestNumber;
    }

    public static int indexOfSmallest(int[] array) {
        int smallestNumber = array[0];
        int smallestIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestNumber) {
                smallestNumber = array[i];
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestNumber = table[startIndex];
        int smallestIndex = startIndex;

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallestNumber) {
                smallestNumber = table[i];
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];

        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int smallestIndex = indexOfSmallestFrom(array, i);

            swap(array, i, smallestIndex);
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

}