package Js_Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Number_baseball_game {
    public static List<Integer> randomnumber() {
        List<Integer> list = new ArrayList<>();
        while (list.size() < 3) {
            int num = (int) (Math.random() * 9) + 1;
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        return (list);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> 정답 = randomnumber();
        boolean 스트라이크수 = true;
        int 다시시작 = 0;
        int Out = 0;
        int Ball = 0;
        int Strike = 0;
        while (스트라이크수) {
            List<Integer> 제출 = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                제출.add(scanner.nextInt());
            }

        }
    }
}
