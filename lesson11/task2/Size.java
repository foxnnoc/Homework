package lesson11.task2;

public enum Size {
    XXS(32) {
        public void getDescription() {
            System.out.println("Детский размер");
        }
    }, XS(34), S(36), M(38), L(42);

    private int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void getDescription() {
        System.out.println("Взрослый размер");
    }
}
