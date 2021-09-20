package Js_Project2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static Js_Project2.RandomnessNumber.TYPE_OF_LENGTH;

//입력숫자 리스트 생성
public class InputNumber {

    public List<Integer> filterDuplicatedInputNumber(String input) { //입력숫자 저장소
        Set<Integer> temporaryInputNumberStorage = new LinkedHashSet<>();
        for (int i = 0; i < TYPE_OF_LENGTH; i++) {
            temporaryInputNumberStorage.add(input.charAt(i) - '0');
        }
        System.out.println(temporaryInputNumberStorage);
        List<Integer> confirmationInputNumberStorage = new ArrayList<>(temporaryInputNumberStorage);  //셋을 리스트로 바꿔 리턴메서드
        System.out.println(confirmationInputNumberStorage); //임시
        return confirmationInputNumberStorage;
    }
}
