package lesson10.task5;

public class Drum implements Tool {
    private double size;

    @Override
    public void play() {
        System.out.println("Играет " + KEY + " барабан.");
    }
}
