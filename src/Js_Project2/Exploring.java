package Js_Project2;

import java.util.List;

import static Js_Project2.NumberBaseballGame.numberIndex;

//탐색
public class Exploring {

    public int exploringStrike(List<Integer> random, List<Integer> input) { //스트라이크 적립메서드
        if (isValidStrike(random, input)) {
            return 1;
        } else {
            return 0;
        }
    }

    private boolean isValidStrike(List<Integer> random, List<Integer> input) {
        return random.contains(input.get(numberIndex)) && random.indexOf(input.get(numberIndex)) == numberIndex;
    }

    public int exploringBall(List<Integer> random, List<Integer> input) { //볼 적립메서드
        if (isValidBall(random, input)) {
            return 1;
        } else {
            return 0;
        }
    }

    private boolean isValidBall(List<Integer> random, List<Integer> input) {
        return random.contains(input.get(numberIndex)) && random.indexOf(input.get(numberIndex)) != numberIndex;
    }


}
