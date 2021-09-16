package Js_Project2;

import java.util.Scanner;

//입력
public class Input {

    private final Scanner scanner = new Scanner(System.in);

    public String inputNumber() { //게임시작 숫자입력메서드
        System.out.print("숫자를 입력해주세요:");
        return scanner.next();
    }

    public int newNumber() { //재시작 여부입력메서드
        return scanner.nextInt();
    }
}
