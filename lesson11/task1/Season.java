package lesson11.task1;

enum Season {
    WINTER(0), SPRING(10), SUMMER(23) {
        public void getDescription() {
            System.out.println("Теплое время года");
        }
    }, AUTUMN(16);

    Season(int temp) {
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    private int temp;

    public void getDescription() {
        System.out.println("Холодное время года");
    }
}