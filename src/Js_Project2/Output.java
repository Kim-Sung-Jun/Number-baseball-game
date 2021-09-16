package Js_Project2;

//출력
public class Output {

    public void nothingPrint(int strike, int ball) { //낫싱 출력메서드
        if (strike == 0 && ball == 0) {
            System.out.println("낫싱");
        } else {
            strikePrint(strike, ball);
        }
    }

    private void strikePrint(int strike, int ball) { //스트라이크 출력메서드
        if (strike > 0 && ball == 0) {
            System.out.println(strike + " 스트라이크");
        } else {
            ballPrint(strike, ball);
        }
    }

    private void ballPrint(int strike, int ball) { //스트라이크+볼, 볼 출력메서드
        if (strike > 0 && ball > 0) {
            System.out.println(strike + " 스트라이크" + " " + ball + "볼");
        } else {
            System.out.println(ball + "볼");
        }
    }

    public void startNewGamePrint() { //안내문 메서드
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
