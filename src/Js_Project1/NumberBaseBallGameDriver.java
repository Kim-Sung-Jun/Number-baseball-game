package Js_Project1;

public class NumberBaseBallGameDriver {

    public static void main(String[] args) {
        Input input = new Input();
        Output output = new Output();
        NumberBaseballGame numberBaseballGame = new NumberBaseballGame();
        numberBaseballGame.play(input, output);
    }
}
