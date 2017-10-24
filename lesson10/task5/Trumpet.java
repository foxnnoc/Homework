package lesson10.task5;

public class Trumpet implements Tool {
    private double diameter;

    @Override
    public void play() {
        System.out.println("Играет " + KEY + " труба.");
    }
}
