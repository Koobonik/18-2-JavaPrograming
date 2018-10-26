package Lab6;

import java.util.Scanner;

abstract public class Hero {
    private String name; // 영웅 이름
    private String position; // 영웅 포지션
    private int shot_num; // 영웅 총알 수
    private int gauge; // 영웅 궁극기 게이지
    private int life; // 영웅 체력

    public Hero(String name, int life, int shot_num, String position){
        this.name = name;
        this.life = life;
        this.shot_num = shot_num;
        this.gauge = 0;
        this.position = position;
    }
    public void setShot_num(int shot_num) {
        this.shot_num = shot_num;
    }
    public int getShot_num(){
        return shot_num;
    }

    public int getGauge() {
        return gauge;
    }
    public void setGauge(int gauge) {
        this.gauge = gauge;
    }

    public void info(){
        System.out.println("영웅 : " + this.name);
        System.out.println("포지션 : " + this.position);
        System.out.println("총알수 : " + this.shot_num);
        System.out.println("생명 : " + this.life);
        System.out.println("궁극기 게이지 : " + this.gauge);
        System.out.println("남은 총알 수 " + this.shot_num + "입니다.");

    }


    abstract public void menu(Scanner kbd);
}
