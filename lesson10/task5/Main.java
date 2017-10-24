package lesson10.task5;

public class Main {
    public static void main(String[] args) {
        Tool[] tools = {
                new Guitar(),
                new Drum(),
                new Trumpet()
        };
        for (Tool tool : tools) {
            tool.play();
        }
    }
}
