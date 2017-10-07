package lesson5_6.task2;

import lesson5_6.task2.modul.MyBubbleSort;

import java.util.Arrays;

public class DemoBubble {
    public static void main(String[] args) {
        int[][] data = {
                {4, 1, 7, -5, 0, 8},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " => ");
            MyBubbleSort.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}

