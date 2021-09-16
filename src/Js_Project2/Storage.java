package Js_Project2;

//strike, ball 저장소
public class Storage {

    private int strike;
    private int ball;

    public void eraseStorageValue() {
        this.strike = 0;
        this.ball = 0;
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

//
//
//    public void Initialize() {
//        randomNumbers.clear();
//        randomNumber.clear();
//    }
//    public Storage() { //기본생성자, 값을 초기화
//        this(INITIAL_PRICE, INITIAL_PRICE);
//    }
//
//    public Storage(int strike, int ball) {
//        this.strike += strike;
//        this.ball += ball;
//    }

}
