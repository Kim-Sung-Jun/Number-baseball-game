package Js_Project;

public class Nbg_output {
//count = 0;
//        제출.clear();
//        Ball = 0;
//        Strike = 0;
    //초기화해주기
    Nbg_Analyze analyzeclass = new Nbg_Analyze();

    int count = 0;
    int Ball = 0;
    int Strike = 0;

    public void 낫싱print() {
        if (Strike == 0 && Ball == 0) {
            System.out.println("낫싱");
        } else {
            스트라이크print();
        }
    }
    public void 스트라이크print() {
        if (Strike > 0 && Ball == 0) {
            System.out.println(Strike + " 스트라이크");
        } else {
            볼print();
        }
    }
    public void 볼print() {
        if (Strike > 0 && Ball > 0) {
            System.out.println(Strike + " 스트라이크" + " " + Ball + "볼");
        } else {
            System.out.println(Ball + "볼");
        }
    }
}
