package Js_Project2;

import java.util.Set;

//비교
public class Exploring {
    int count = 0;
    public void Repeat(Set<Integer> random, Set<Integer> input) {
        while (count < 3) {
            StrikeExploring(random, input);
            count++;
        }
        inputclass.outputclass.낫싱print();
    }

    public void StrikeExploring(Set<Integer> random, Set<Integer> input) {
        if (random.contains(input.get(count)) && list.indexOf(inputclass.입력숫자.get(count)) == count) {
            inputclass.outputclass.Strike++;
        } else {
            BallExploring(random, input);
        }
    }

    public void BallExploring(Set<Integer> random, Set<Integer> input) {
        if (list.contains(inputclass.입력숫자.get(count))) {
            inputclass.outputclass.Ball++;
        }
    }
}
