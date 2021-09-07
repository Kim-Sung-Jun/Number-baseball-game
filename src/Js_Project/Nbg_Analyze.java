package Js_Project;

import java.util.ArrayList;
import java.util.List;

public class Nbg_Analyze {
    List<Integer> list = new ArrayList<>();
    Nbg_input inputclass = new Nbg_input();
    int count = 0;

    void 정답randomnumber() {
        int number;
        while (list.size() < 3) {
            number = (int) (Math.random() * 9) + 1;
            정답listadd(number);
        }
    }

    void 정답listadd(int number) {
        if (!list.contains(number)) {
            list.add(number);
        }
    }

    public void Repeat() {
        while (count < 3) {
            StrikeExploring();
            count++;
        }
        inputclass.outputclass.낫싱print();
    }

    public void StrikeExploring() {
        if (list.contains(inputclass.입력숫자.get(count)) && list.indexOf(inputclass.입력숫자.get(count)) == count) {
            inputclass.outputclass.Strike++;
        } else {
            BallExploring();
        }
    }

    public void BallExploring() {
        if (list.contains(inputclass.입력숫자.get(count))) {
            inputclass.outputclass.Ball++;
        }
    }
}
