package Js_Project2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Iterator;

//중복숫자 제거 저장소
public class Storage {
    //private final int RANDOM_NUMBERS_FROM_0_TO_9 = 10;
    private final int TYPE_OF_LENGTH = 3;

    private final List<Integer> randomNumbers = new ArrayList<>(); //게임 1판이 끝날때까지 기억
    private final Set<Integer> randomNumber = new LinkedHashSet<>();

    public List<Integer> changeRandomNumberType() { //0~9 중복없이 랜덤생성메서드
        int RANDOM_NUMBERS_FROM_0_TO_9 = 10;
        while (randomNumber.size() < TYPE_OF_LENGTH) {
            randomNumber.add((int) (Math.random() * RANDOM_NUMBERS_FROM_0_TO_9));
        }
        Iterator repetition = randomNumber.iterator();
        while (repetition.hasNext()) {
            randomNumbers.add((int) repetition.next());
        }
        System.out.println(randomNumber);
        return randomNumbers;
    }

    public void Initialize() {
        randomNumbers.clear();
        randomNumber.clear();
    }

//    public List<Integer> makerandomNumberStorage(Set<Integer> storagerandomNumber) {
//        Iterator iter = storagerandomNumber.iterator();
//        while (iter.hasNext()) {
//            randomNumbers.add((int) iter.next());
//        }
//        return randomNumbers;
//    }

    public List<Integer> filterDuplicatedInputNumber(String input) { //입력숫자 저장소
        Set<Integer> storageInput = new LinkedHashSet<>();
        for (int i = 0; i < TYPE_OF_LENGTH; i++) {
            storageInput.add((int) input.charAt(i) - '0');
        }
        List<Integer> numberInput = new ArrayList<>(storageInput);  //셋을 리스트로 바꿔 리턴메서드
        return numberInput;
    }

//    public List<Integer> makeInputStorage(Set<Integer> storageInput) { //셋을 리스트로 바꿔 리턴메서드
//        List<Integer> numberInput = new ArrayList<>(storageInput);
//        return numberInput;
//    }
}
