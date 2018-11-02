package Lab5._2;

import java.util.Scanner;

public class Order {
    private int money;

    Order(int money){
        this.money = money;
    }

    //메뉴, 가격 출력
    public void showMenu(Product[] p){
        Scanner sc = new Scanner(System.in);
        System.out.println("상품을 선택하세요.");
        for (int i = 0 ; i < p.length ; i++){
            System.out.println(i + 1 + "." + p[i].getName() + " :  " + p[i].getPrice() +" 원");
        }
        // 선택을 한다.
        int choice = sc.nextInt();

        // 선택한 choice 번호와 i 를 비교하여 맞을경우 그 상품의 가격만큼 지불하여 남은 돈을 설정한다.
        for(int i = 0 ; i < p.length; i++){
            if (choice == i + 1){
                money -= p[i].getPrice();
                result(); // 물건을 사고나면 남은 돈을 보여준다.
            }
        }
    }

    // 결과화면 출력
    public void result(){
        System.out.println("남은 돈은 " + money + "원 입니다.");
    }
}
