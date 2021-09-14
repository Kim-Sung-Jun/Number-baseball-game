package Js_Project2;

import java.util.List;

//탐색
public class Exploring {

    private final int LAST_INDEX = 2;
    private int count = 0;
    private int strike = 0;
    private int ball = 0;

    public void clearValue() { //초기화메서드 //다시하기
        strike = 0;
        ball = 0;
        count = 0;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public void repeat(List<Integer> random, List<Integer> input) { //반복메서드
        while (count <= LAST_INDEX) {
            exploringStrike(random, input);
            count++;
        }
    }

    private void exploringStrike(List<Integer> random, List<Integer> input) { //스트라이크 적립메서드
        if (isValidStrike(random, input)) {
            strike++;
        } else {
            exploringBall(random, input);
        }
    }

    private boolean isValidStrike(List<Integer> random, List<Integer> input) {
        return random.contains(input.get(count)) && random.indexOf(input.get(count)) == count;
    }

    private void exploringBall(List<Integer> random, List<Integer> input) { //볼 적립메서드
        if (isValidBall(random, input)) {
            ball++;
        }
    }

    private boolean isValidBall(List<Integer> random, List<Integer> input) {
        return random.contains(input.get(count));
    }
}
