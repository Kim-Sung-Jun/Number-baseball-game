package Js_Project2;
//몸체

public class NumberBaseballGame {
    Exploring exploring = new Exploring();
    Storage storage = new Storage();
    Output output = new Output();

    public void play(Input input, Output output) {
        while (true) {
            storage.listClear();
            exploring.Repeat(storage.makeRandomNumber(), storage.filterDuplicatedInputNumber(input.numberInput()));
            output.nothingPrint(exploring.strike, exploring.ball);
            System.out.println(storage.list);
            System.out.println(storage.randomNumberList);
        }
    }
}
