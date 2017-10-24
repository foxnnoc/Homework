package lesson10.task1;

public class Rectangle extends Shape {
    private double top;
    private double left;
    private double high;
    private double width;

    public double area() {
        return high * width;
    }

    public Rectangle(double top, double left, double high, double width, String color) {
        super(color);
        this.top = top;
        this.left = left;
        this.high = high;
        this.width = width;
    }

    public double getTop() {
        return top;
    }

    public void setTop(double top) {
        this.top = top;
    }

    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(rectangle.top, top) != 0) return false;
        if (Double.compare(rectangle.left, left) != 0) return false;
        if (Double.compare(rectangle.high, high) != 0) return false;
        return Double.compare(rectangle.width, width) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(top);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(left);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(high);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "top=" + top + ", left=" + left + ", high=" + high + ", width=" + width + '}';
    }

    @Override
    public void draw() {
        System.out.println("Рисую прямоугольник.");
    }
}
