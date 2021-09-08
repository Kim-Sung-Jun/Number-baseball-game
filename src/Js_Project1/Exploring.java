package Js_Project1;

import java.util.Scanner;

//비교
public class Exploring {

    //입력숫자중복비교
    public void filterDuplicatedInputNumber(String input) {
        String inputNumber = input;
        for (int i = 0; i < 3; i++) {
            storage.list.add((int) inputNumber.charAt(i) - '0');
        }
    }
    //랜덤숫자중복비교
    public void filterDuplicatedRandomNumber(int randomnumber, Storage storage) {
        if (!storage.randomNumberList.contains(randomnumber)) {
            storage.randomNumberList.add(randomnumber);
        }
    }

    int count = 0;
    //입력숫자리스트, 랜덤숫자리스트 비교
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
