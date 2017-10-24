package lesson10.task5;

public class Guitar implements Tool {
    private int stringNumber;

    @Override
    public void play() {
        System.out.println("Играет " + KEY + " гитара.");

    }
}
