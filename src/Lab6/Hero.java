package Lab6;

import java.util.Scanner;

abstract public class Hero {
    private String name;
    private String position;


    private int shot_num;



    private int gauge;
    private int life;

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
        System.out.println(name);
    }
    abstract public void menu(Scanner kbd);

}
