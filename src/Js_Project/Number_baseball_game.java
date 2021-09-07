package Js_Project;

import java.util.ArrayList;
import java.util.List;

public class Number_baseball_game {
    List<Integer> list = new ArrayList<>();

    void 정답randomnumber() {
        int number;
        while (list.size() < 3) {
            number = (int) (Math.random() * 9) + 1;
            정답listadd(number);
        }
    }

    void 정답listadd(int num) {
        if (!list.contains(num)) {
            list.add(num);
        }
    }

    public static void main(String[] args) {
        Number_baseball_game cal = new Number_baseball_game();
        Nbg_input input = new Nbg_input();
        cal.정답randomnumber();
        while (true) {
            input.input();
            System.out.println(cal.list);
            System.out.println(cal.제출);
        }
    }
}
