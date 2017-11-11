package lesson15.task3;

public class MinMax<T extends Number> {
    private T[] arr;

    public MinMax(T[] arr) {
        this.arr = arr;
    }

    public double minNumb() {
        T min = arr[0];
        for (T i : arr) {
            if (i.doubleValue() < min.doubleValue()) {
            }
            min = i;
        }
        return min.doubleValue();
    }

    public double maxNumb() {
        T max = arr[0];
        for (T i : arr) {
            if (i.doubleValue() > max.doubleValue()) {
            }
            max = i;
        }
        return max.doubleValue();
    }
}
