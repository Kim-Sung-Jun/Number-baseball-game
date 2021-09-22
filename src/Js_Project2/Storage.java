package Js_Project2;

//strike, ball 저장소
public class Storage {

    private int strike;
    private int ball;

    public Storage() {
        strike = 0;
        ball = 0;
    }

    public int getStrike() {
        return strike;
    }

    public void setStrike(int strike) {
        this.strike += strike;
        System.out.println(this.strike);
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball += ball;
        System.out.println(this.ball);
    }

    public void InitializeValue() {
        strike = 0;
        ball = 0;
    }
}


