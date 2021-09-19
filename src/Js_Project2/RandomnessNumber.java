package Js_Project2;


import java.util.*;

//랜덤숫자생성
public class RandomnessNumber {

    static final int TYPE_OF_LENGTH = 3;
    private static final int RANDOM_NUMBERS_FROM_0_TO_9 = 9;
    private final List<Integer> confirmationRandomNumberStorage = new ArrayList<>(); //게임 1판이 끝날때까지 기억
    private final Set<Integer> temporaryRandomNumberStorage = new LinkedHashSet<>();
//    private final Random random = new Random(); 준성이한테 물어보기 메서드안에서, 밖에서 차이

    public List<Integer> makeRandomNumber() { //0~9 중복없이 랜덤생성메서드
        Random random = new Random();
        while (temporaryRandomNumberStorage.size() < TYPE_OF_LENGTH) {
            temporaryRandomNumberStorage.add(random.nextInt(RANDOM_NUMBERS_FROM_0_TO_9));
        }
        System.out.println("랜덤넘버" + temporaryRandomNumberStorage);
        List<Integer> confirmationRandomNumberStorage = new ArrayList<>(temporaryRandomNumberStorage);
        System.out.println("랜덤넘버" + confirmationRandomNumberStorage);
        return confirmationRandomNumberStorage;
    }

    public void clean() {
        confirmationRandomNumberStorage.clear();
        temporaryRandomNumberStorage.clear();
    }

//    public List<Integer> transformRandomNumberType(Set<Integer> temporaryRandomNumberStorage) { //리스트 초기화해줘야댐
//        confirmationRandomNumberStorage.addAll(temporaryRandomNumberStorage);
//        System.out.println(confirmationRandomNumberStorage);
//        return confirmationRandomNumberStorage;
//    }
}
