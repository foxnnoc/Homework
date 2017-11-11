package lesson15.task2;

import java.util.Arrays;

public class Matrix<T extends Number> {
    private T[][] matrix;
    private int rowsNum;
    private int colunsNum;

    public Matrix(T[][] matrix) {
        this.matrix = matrix;
        rowsNum = matrix.length;
        colunsNum = matrix[0].length;
    }


    public T[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(T[][] matrix) {
        this.matrix = matrix;
    }

    public int getRowsNum() {
        return rowsNum;
    }

    private void setRowsNum(int rowsNum) {
        this.rowsNum = rowsNum;
    }

    public int getColunsNum() {
        return colunsNum;
    }

    private void setColunsNum(int colunsNum) {
        this.colunsNum = colunsNum;
    }

    public void print() {
        for (int i = 0; i < getRowsNum(); i++) {
            for (int j = 0; j < getColunsNum(); j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public Matrix sum(Matrix m2) {
        if (this.getRowsNum() == m2.getRowsNum() && this.getColunsNum() == m2.getColunsNum()) {
            System.out.println("Матрицы имеет одинаковую размерность");
            Double[][] d = new Double[rowsNum][colunsNum];
            for (int i = 0; i < getRowsNum(); i++) {
                for (int j = 0; j < getColunsNum(); j++) {
                    d[i][j] = matrix[i][j].doubleValue() + m2.getMatrix()[i][j].doubleValue();
                }
            }
            return new Matrix(d);
        } else {
            System.out.println("Матрицы имеют разные размерности");
        }
        return null;
    }

    public Matrix multiply(T t) {
        Double[][] md = new Double[rowsNum][colunsNum];
        for (int i = 0; i < getRowsNum(); i++) {
            for (int j = 0; j < getColunsNum(); j++) {
                md[i][j] = matrix[i][j].doubleValue() * t.doubleValue();
            }
        }
        return new Matrix(md);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Matrix matrix1 = (Matrix) o;

        if (rowsNum != matrix1.rowsNum) return false;
        if (colunsNum != matrix1.colunsNum) return false;
        return Arrays.deepEquals(matrix, matrix1.matrix);
    }

    @Override
    public int hashCode() {
        int result = Arrays.deepHashCode(matrix);
        result = 31 * result + rowsNum;
        result = 31 * result + colunsNum;
        return result;
    }

    @Override
    public String toString() {
        return "Matrix{" + "matrix=" + Arrays.deepToString(matrix) + ", rowsNum=" + rowsNum + ", colunsNum=" + colunsNum + '}';
    }
}
