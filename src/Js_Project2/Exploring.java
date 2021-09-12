package Js_Project2;

import java.util.ArrayList;
import java.util.List;

//탐색
public class Exploring {
    int count = 0;
    int strike = 0;
    int ball = 0;

    private void listClear() { //초기화메서드 //다시하기
        //storage.inputSet.clear();
        strike = 0;
        ball = 0;
        count = 0;
    }


    public void Repeat(List<Integer> random, List<Integer> input) { //반복메서드
        while (count < 3) {
            changeSetToList(random, input);
            count++;
        }
    }

    private void changeSetToList(List<Integer> randomset, List<Integer> input) { //셋을 리스트로 변경메서드
        List<Integer> randomList = new ArrayList<>(randomset);
        List<Integer> inputList = new ArrayList<>(input);
        strikeExploring(randomList, inputList);
        randomList.clear();
        inputList.clear();
    }

    private void strikeExploring(List<Integer> random, List<Integer> input) { //스트라이크 적립메서드
        if (random.contains(input.get(count)) && random.indexOf(input.get(count)) == count) {
            strike++;
        } else {
            ballExploring(random, input);
        }
    }

    private void ballExploring(List<Integer> random, List<Integer> input) { //볼 적립메서드
        if (random.contains(input.get(count))) {
            ball++;
        }
    }
}
