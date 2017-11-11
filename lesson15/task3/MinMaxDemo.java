package lesson15.task3;

public class MinMaxDemo {
    public static void main(String[] args) {
        Integer[] intNumb = new Integer[]{18, -5, 6, 20, -30};
        Double[] dNumb = new Double[]{22.6, 229.3, -6.5, 0.63};
        MinMax<Integer> minMax1 = new MinMax<>(intNumb);
        MinMax<Double> minMax2 = new MinMax<>(dNumb);
        System.out.println("Минимальное значение матрицы из Integer равен: " + minMax1.minNumb());
        System.out.println("Минимальное значение матрицы из Double равен: " + minMax2.minNumb());
    }
}