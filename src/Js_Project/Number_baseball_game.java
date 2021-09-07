package Js_Project;

import java.util.ArrayList;
import java.util.List;

public class Number_baseball_game {
    List<Integer> list = new ArrayList<>();
    Nbg_input input = new Nbg_input();

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

    public static void main(String[] args) {
        Number_baseball_game cal = new Number_baseball_game();
        cal.정답randomnumber();
        int count = 0;
        while (count < 1) {
            cal.input.input();
            System.out.println(cal.list);
            System.out.println(cal.input.입력숫자);
            count++;
        }
    }
}
