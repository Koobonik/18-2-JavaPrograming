package Lab5._2;

import java.util.Scanner;

/*
 *
 * 201504003 구본익
 * 2018-10-09 24:00 까지 과제
 *
 * */

public class Lab5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("201504003 구본익");
        System.out.println("=================");


        System.out.println("몇 개의 상품을 입력하시겠습니까?");
        int num = sc.nextInt();
        Product[] products = new Product[num]; // num 개수 만큼 상품 생산
        for(int i = 0; i< num ; i++){
            sc.nextLine(); // 버퍼 제거
            System.out.println(i + 1 + " 상품명:");
            String name = sc.nextLine();
            System.out.println(i + 1 + " 상품가격:");
            int price = sc.nextInt();
            products[i] = new Product(name, price);
        }
        //

        //

        // 현재 갖고 있는 돈 출력
        System.out.println("현재 갖고 있는 돈을 입력해주세요");
        int money = sc.nextInt();
        Order order = new Order(money);
        order.showMenu(products);


    }
}
