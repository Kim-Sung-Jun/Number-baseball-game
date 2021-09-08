package Js_Project2;

import Js_Project1.Exploring;

import java.util.LinkedHashSet;
import java.util.Set;

//저장소
public class Storage {
    Set<Integer> randomNumberList = new LinkedHashSet<>();
    Set<Integer> list = new LinkedHashSet<>();

    public Set<Integer> makeRandomNumber() {
        while (randomNumberList.size() < 3) {
            randomNumberList.add((int) (Math.random() * 9) + 1);
        }
        return randomNumberList;
    }

    public Set<Integer> filterDuplicatedInputNumber(String input) {
        for (int i = 0; i < 3; i++) {
            list.add((int) input.charAt(i) - '0');
        }
        return list;
    }
}
