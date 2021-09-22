package Js_Project2;

import java.util.List;

//몸체
public class NumberBaseballGame {

    private static boolean startValue = true;                   //게임반복용
    private final InputNumber inputNumber = new InputNumber();
    private final Exploring exploring = new Exploring();
    private final Storage storage = new Storage();
    private final Replay replay = new Replay();
    private final RandomnessNumber randomnessNumber = new RandomnessNumber();

    private static final int RESTART = 1;
    private static final int MAX_VALUE = 3;
    private static final int LAST_INDEX = 2;

    public static int numberIndex = 0; //생성자 만들어주기

    public void play(Input input, Output output) { //게임기메서드
        while (startValue) {
            repeatExploring(randomnessNumber.makeRandomNumber(), inputNumber.filterDuplicatedInputNumber(input.inputNumber()));
            output.nothingPrint(storage.getStrike(), storage.getBall());
            checkStrike(input);
            numberIndex = 0;
            storage.InitializeValue();
        }
    }

    public void startOrEnd(int newNumber) { //재시작 여부메서드
        if (newNumber == RESTART) {
            startValue = true;
            randomnessNumber.clean();
        } else {
            startValue = false;
        }
    }

    public void checkStrike(Input input) { //스트라이크 갯수 확인메서드
        if (storage.getStrike() == MAX_VALUE) {
            replay.choose();
            startOrEnd(input.newNumber());
        }
    }

    private void repeatExploring(List<Integer> random, List<Integer> input) {  //반복 탐색 메서드
        while (numberIndex <= LAST_INDEX) {
            storage.setStrike(exploring.exploringStrike(random, input));
            storage.setBall(exploring.exploringBall(random, input));
            numberIndex++;
        }
    }
}
