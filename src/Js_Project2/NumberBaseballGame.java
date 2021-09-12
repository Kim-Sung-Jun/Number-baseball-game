package Js_Project2;

//몸체
public class NumberBaseballGame {

    private boolean start = true;                    //게임반복용
    Exploring exploring = new Exploring();
    Storage storage = new Storage();

    void play(Input input, Output output) { //게임기메서드
        while (start) {
            listClear();                     //초기화
            exploring.Repeat(storage.makeRandomNumber(), storage.filterDuplicatedInputNumber(input.numberInput()));
            output.nothingPrint(exploring.strike, exploring.ball);
            notThreeStrike();               //스트라이크 카운트
        }
    }

//    private void listClear() { //초기화메서드
//        storage.inputSet.clear();
//        exploring.strike = 0;
//        exploring.ball = 0;
//        exploring.count = 0;
//    }

    private void notThreeStrike() { //스트라이크 갯수 확인메서드
        if (exploring.strike != 3) {
            start = true;
        } else {
            startOrEnd();
        }
    }

    private void startOrEnd() { //스트라이크 3개 다 맞추면 안내문 발송메서드
        Output output = new Output();
        Input input = new Input();
        output.startNewGamePrint();
        startOrEnd2(input.newNumber());
    }

    private void startOrEnd2(int newNumber) { //재시작 여부메서드
        if (newNumber == 1) {
            start = true;
        } else if (newNumber == 2) {
            start = false;
        }
    }
}
