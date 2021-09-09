package Js_Project2;

import java.util.LinkedHashSet;
import java.util.Set;

//중복숫자 제거 저장소
public class Storage {
    Set<Integer> randomNumberList = new LinkedHashSet<>();
    Set<Integer> inputList = new LinkedHashSet<>();

    public Set<Integer> makeRandomNumber() { //0~9 중복없이 랜덤생성메서드
        while (randomNumberList.size() < 3) {
            randomNumberList.add((int) (Math.random() * 9) + 1);
        }
        return randomNumberList;
    }

    public Set<Integer> filterDuplicatedInputNumber(String input) { //입력숫자 저장소
        for (int i = 0; i < 3; i++) {
            inputList.add((int) input.charAt(i) - '0');
        }
        return inputList;
    }
}
