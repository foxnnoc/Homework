package lesson10.task1;

public abstract class Shape {
    private String color;

    abstract void draw();

    public double area() {
        return 0;
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
