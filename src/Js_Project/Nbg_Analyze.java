package Js_Project;

public class Nbg_Analyze {
    Number_baseball_game mainclass = new Number_baseball_game();
    Nbg_input inputclass = new Nbg_input();

    public int Return() {

    }
    int count = 0;
    int Ball = 0;
    int Strike = 0;

    public void Repeat() {
        while (count < 3) {
            StrikeExploring();
            count++;
        }
    }

    public void StrikeExploring() {
        if (mainclass.list.contains(inputclass.입력숫자.get(count)) && mainclass.list.indexOf(inputclass.입력숫자.get(count)) == count) {
            Strike++;
        } else {
            BallExploring();
        }
    }

    public void BallExploring() {
        if (mainclass.list.contains(inputclass.입력숫자.get(count))) {
            Ball++;
        }
    }

}
