package Js_Project1;
//저장소
import java.util.ArrayList;
import java.util.List;

public class Storage {
    List<Integer> randomNumberList = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public void makeRandomNumber() {
        Exploring exploring = new Exploring();
        int number;
        while (randomNumberList.size() < 3) {
            number = (int) (Math.random() * 9) + 1;
            exploring.filterDuplicatedRandomNumber(number);
        }
    }


    public boolean isInputEnd() {
        return list.size() == 3;
    }
}
