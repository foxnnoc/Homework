package lesson15.task2;

public class Matrix2 {
    public static void main(String[] args) {
        Integer[][] iMatrix = new Integer[][]{{-50, 2, 23,}, {19, 6, -8}};
        Double[][] dMatrix = new Double[][]{{53.9, -2.3, 62.0,}, {28.3, 0.3, -5.0,}};
        Matrix <Integer> integerMatrix=new Matrix<>(iMatrix);
        Matrix <Double>doubleMatrix=new Matrix<>(dMatrix);
        Matrix sum=integerMatrix.sum(doubleMatrix);
        Matrix multiply = doubleMatrix.multiply(5.0);
        System.out.println(multiply);
        System.out.println();
        System.out.println(sum);
    }
}