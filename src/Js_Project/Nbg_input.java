package Js_Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nbg_input {
    Scanner scanner = new Scanner(System.in);
    List<Integer> 입력숫자 = new ArrayList<>();
    Nbg_Analyze Analyzeclass = new Nbg_Analyze();

    public void input() {
        System.out.print("숫자를 입력해주세요:");
        같은숫자있는지();
    }
    public void 같은숫자있는지() {
        String number = scanner.next();
        for (int i = 0; i < 3; i++) {
            입력숫자.add((int) number.charAt(i) - '0');
        }
        Analyzeclass.Repeat();
    }
}
