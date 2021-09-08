package Js_Project2;
//몸체

public class NumberBaseballGame {
    Exploring exploring = new Exploring();
    Storage storage = new Storage();


    public void play(Input input, Output output) {
        exploring.Repeat(storage.makeRandomNumber(), storage.filterDuplicatedInputNumber(input.numberInput()));

    }
}
