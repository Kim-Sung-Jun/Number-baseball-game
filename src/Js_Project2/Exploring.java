package Js_Project2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//비교
public class Exploring {
    int count = 0;
    int strike = 0;
    int ball = 0;

    public void Repeat(Set<Integer> random, Set<Integer> input) {
        while (count < 3) {
            changeSetToList(random, input);
            count++;
        }
    }

    private void changeSetToList(Set<Integer> randomset, Set<Integer> input) {
        List<Integer> randomList = new ArrayList<>(randomset);
        List<Integer> inputList = new ArrayList<>(input);
        StrikeExploring(randomList, inputList);
    }

    public void StrikeExploring(List<Integer> random, List<Integer> input) {
        if (random.contains(input.get(count)) && random.indexOf(input.get(count)) == count) {
            strike++;
        } else {
            BallExploring(random, input);
        }
    }

    public void BallExploring(List<Integer> random, List<Integer> input) {
        if (random.contains(input.get(count))) {
            ball++;
        }
    }
}
