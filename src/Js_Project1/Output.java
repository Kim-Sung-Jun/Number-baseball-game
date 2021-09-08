package Js_Project1;

public class Output {

    int Ball = 0;
    int Strike = 0;

    public void nothingPrint() {
        if (Strike == 0 && Ball == 0) {
            System.out.println("낫싱");
        } else {
            strikeprint();
        }
    }

    public void strikeprint() {
        if (Strike > 0 && Ball == 0) {
            System.out.println(Strike + " 스트라이크");
        } else {
            ballPrint();
        }
    }

    public void ballPrint() {
        if (Strike > 0 && Ball > 0) {
            System.out.println(Strike + " 스트라이크" + " " + Ball + "볼");
        } else {
            System.out.println(Ball + "볼");
        }
    }
}
