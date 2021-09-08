package Js_Project2;

import java.util.Scanner;

public class Input {
    public String numberInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요:");
        return scanner.next();
    }
}
