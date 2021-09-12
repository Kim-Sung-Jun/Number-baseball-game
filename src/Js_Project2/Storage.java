package Js_Project2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//중복숫자 제거 저장소
public class Storage {

    Set<Integer> randomNumberSet = new LinkedHashSet<>();
    Set<Integer> inputSet = new LinkedHashSet<>();

    List<Integer> makeRandomNumber() { //0~9 중복없이 랜덤생성메서드
        while (randomNumberSet.size() < 3) {
            randomNumberSet.add((int) (Math.random() * 9) + 1);
        }
        List <Integer> randomNumber = new ArrayList<>(randomNumberSet);
        return randomNumber;
    }

    List<Integer> filterDuplicatedInputNumber(String input) { //입력숫자 저장소
        for (int i = 0; i < 3; i++) {
            inputSet.add((int) input.charAt(i) - '0');
        }
        List <Integer> inputNumber = new ArrayList<>(inputSet);
        return inputNumber;
    }
}
