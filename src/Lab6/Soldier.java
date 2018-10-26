package Lab6;

import java.util.Scanner;

public class Soldier extends Hero implements Attack {
    public Soldier(){
        // 생성자
        super("솔져:76", 200, 25, "공격형");
    }
    public void menu(Scanner kbd){

    }
    public void LeftClickAttack(){
        super.setShot_num(super.getShot_num() - 1);
    }
    public void Ultimate(){
        super.setGauge(0);
    }
    public void RightClickAttack(){

    }
}
