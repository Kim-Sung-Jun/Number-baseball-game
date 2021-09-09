package Js_Project2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//탐색
public class Exploring {
    int count = 0;
    int strike = 0;
    int ball = 0;

    public void Repeat(Set<Integer> random, Set<Integer> input) { //반복메서드
        while (count < 3) {
            changeSetToList(random, input);
            count++;
        }
    }

    private void changeSetToList(Set<Integer> randomset, Set<Integer> input) { //셋을 리스트로 변경메서드
        List<Integer> randomList = new ArrayList<>(randomset);
        List<Integer> inputList = new ArrayList<>(input);
        StrikeExploring(randomList, inputList);
        randomList.clear();
        inputList.clear();
    }

    public void StrikeExploring(List<Integer> random, List<Integer> input) { //스트라이크 적립메서드
        if (random.contains(input.get(count)) && random.indexOf(input.get(count)) == count) {
            strike++;
        } else {
            BallExploring(random, input);
        }
    }

    public void BallExploring(List<Integer> random, List<Integer> input) { //볼 적립메서드
        if (random.contains(input.get(count))) {
            ball++;
        }
    }
}
