package Js_Project2;

public class Output {

    public void nothingPrint(int strike, int ball) {
        if (strike == 0 && ball == 0) {
            System.out.println("낫싱");
        } else {
            strikePrint(strike, ball);
        }
    }

    public void strikePrint(int strike, int ball) {
        if (strike > 0 && ball == 0) {
            System.out.println(strike + " 스트라이크");
        } else {
            ballPrint(strike, ball);
        }
    }

    public void ballPrint(int strike, int ball) {
        if (strike > 0 && ball > 0) {
            System.out.println(strike + " 스트라이크" + " " + ball + "볼");
        } else {
            System.out.println(ball + "볼");
        }
    }
}
