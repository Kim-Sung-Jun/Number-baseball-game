package Js_Project2;

//실행
public class NumberBaseballGameDriver {

    public static void main(String[] args) {
        Input input = new Input();
        Output output = new Output();
        NumberBaseballGame numberBaseballGame = new NumberBaseballGame();
        numberBaseballGame.play(input, output);
    }
}
