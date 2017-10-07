package lesson5_6.task5;

public class SelectionSorter {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int k = i;
            int x = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < x) {
                    k = j;
                    x = array[j];
                }
            }
            if (array[i] != x) {
                array[k] = array[i];
                array[i] = x;
            }
        }
    }
}