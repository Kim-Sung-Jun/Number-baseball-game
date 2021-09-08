package Js_Project1;

public class NumberBaseballGame {
    Exploring exploring = new Exploring();
    Storage storage = new Storage();

    public void play(Input input, Output output) {
        asd(input);
    }

    private void asd(Input input) {
        while (!storage.isInputEnd()) {
            int number = Integer.parseInt(input.numberInput());
            exploring.filterDuplicatedRandomNumber(number, storage);
        }
    }
}
