package lesson16.task1;

public class MyHeavyBox {
    private int deep;

    public MyHeavyBox() {
    }

    public double getDeep() {
        return deep;
    }

    public void setDeep(int heavyBox) {
        this.deep = heavyBox;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyHeavyBox that = (MyHeavyBox) o;

        return deep == that.deep;
    }

    @Override
    public int hashCode() {
        return deep;
    }

    @Override
    public String toString() {
        return "MyHeavyBox{" + "deep=" + deep + '}';
    }
}
