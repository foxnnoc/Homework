package lesson5_6.task2.modul;

public class MyBubbleSort {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean flag = true;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] < array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    flag = false;
                }
            }
            if (flag) {
                break;

            }
        }
    }
}