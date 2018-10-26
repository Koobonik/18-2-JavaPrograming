package Lab6;

import java.util.Scanner;

public class Soldier extends Hero implements Attack {
    public Soldier(){
        // 생성자
        super("솔져:76", 200, 25, "공격형");
    }
    public void menu(Scanner kbd){
        do{
            System.out.println("1. 왼쪽버튼 공격     2. 오른쪽버튼 공격       3. 궁극기           0. 끝내기");
            int choice = kbd.nextInt();
            if (choice == 1){
                this.LeftClickAttack();
            }
            else if (choice == 2){
                this.RightClickAttack();
            }
            else if (choice == 3){
                this.Ultimate();
            }
            else if (choice == 0){
                break;
            }
            else {
                System.out.println("잘못 선택");
            }
            System.out.println("남은 총알 수 " + this.getShot_num() + "입니다.");
        } while (true);

    }
    public void LeftClickAttack(){
        // 총알 수 -1 씩 감소
        super.setShot_num(super.getShot_num() - 1);

        // 궁극기 게이지 10씩 증가
        super.setGauge(super.getGauge() + 10 );

        // 궁극기가 100 이상일시
        if (super.getGauge() >= 100){
            super.setGauge(100);
        }

        // 총알 수 0일시 재장전
        if (super.getShot_num() <= 0){
            super.setShot_num(25);
        }
    }
    public void Ultimate(){
        // 궁극기가 100 이상일시
        if (super.getGauge() >= 100){
            System.out.println("목표를 포착했다.");
            super.setGauge(0);
        }
        else {
            System.out.println("궁극기 게이지가 아직 " + this.getGauge() + "입니다.");
        }

    }
    public void RightClickAttack(){

        // 총알 수 -3 씩 감소
        super.setShot_num(super.getShot_num() - 3);

        // 궁극기 게이지 15씩 증가
        super.setGauge(super.getGauge() + 15 );

        // 총알 수 0일시 재장전
        if (super.getShot_num() <= 0){
            super.setShot_num(25);
        }
        // 궁극기가 100 이상일시
        if (super.getGauge() >= 100){
            super.setGauge(100);
        }

    }
}
