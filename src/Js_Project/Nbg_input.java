package Js_Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nbg_input {
    List<Integer> 입력숫자 = new ArrayList<>();
    Nbg_Analyze Analyzeclass = new Nbg_Analyze();
    Nbg_output outputclass = new Nbg_output();

    public void Initialization() {
        Analyzeclass.count = 0;
        입력숫자.clear();
        outputclass.Ball = 0;
        outputclass.Strike = 0;
    }

    public void input() {
        System.out.print("숫자를 입력해주세요:");
        Initialization();
        Analyzeclass.정답randomnumber();
        같은숫자있는지();
    }

    public void 같은숫자있는지() {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        for (int i = 0; i < 3; i++) {
            입력숫자.add((int) number.charAt(i) - '0');
        }
        Analyzeclass.Repeat();
    }
}
