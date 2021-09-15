package Js_Project2;

//몸체
public class NumberBaseballGame {

    private boolean start = true;                    //게임반복용
    Exploring exploring = new Exploring();
    Storage storage = new Storage();

    public void play(Input input, Output output) { //게임기메서드
        while (start) {
            exploring.clearValue();
            exploring.repeat(storage.changeRandomNumberType(), storage.filterDuplicatedInputNumber(input.numberInput()));
            output.nothingPrint(exploring.getStrike(), exploring.getBall());
            notThreeStrike();
        }
    }

    private void notThreeStrike() { //스트라이크 갯수 확인메서드
        if (exploring.getStrike() != 3) {
            start = true;
        } else {
            ChooseInput();
        }
    }

    private void ChooseInput() { //스트라이크 3개 다 맞추면 안내문 발송메서드
        Output output = new Output();
        Input input = new Input();
        output.startNewGamePrint();
        startOrEnd(input.newNumber());
    }

    private void startOrEnd(int newNumber) { //재시작 여부메서드
        if (newNumber == 1) {
            start = true;
            storage.Initialize();
        } else if (newNumber == 2) {
            start = false;
        }
    }
}
