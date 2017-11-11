package lesson14.task4;

public class DemoFood {
    public static void main(String[] args) {
        Food f = new Food();
        f.prepare(new Cookable() {
            @Override
            public void cook() {
                System.out.println("I am cookble");
            }
        });
    }
}