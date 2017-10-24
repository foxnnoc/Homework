package lesson5_6.task4;
import java.util.Arrays;

public class MyMassiv {
    private int[][] array = {
            {2, 56, 12, 89, 125, 255, 55, -9},
            {5, -9, 23, 9, -59, 56, -3, 8},
            {9, 23, 54, 88, -23, -4947, 1, 25},
            {82, 8, 32, 65, 77, 45, 22, 10},
            {-1, 56, 45, 19, 92, -95, 12, 0}};
    private int[][] arrayMinMax = new int[5][2];

    public void setArrayMinMax() {
        for (int i = 0; i < array.length; i++) {
            int min = 0;
            int max = 0;
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            arrayMinMax[i][0] = min;
            arrayMinMax[i][1] = max;
        }
    }
   public  void  printArreyMinMax(){
       String s = Arrays.deepToString(arrayMinMax);
       System.out.println(s);
   }
}