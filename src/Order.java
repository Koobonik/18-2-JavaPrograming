public class Order {
    private int money;

    Order(int money){
        this.money = money;
    }

    //메뉴, 가격 출력
    public void showMenu(Product[] p){
        System.out.println("상품을 선택하세요.");
        for (int i = 0 ; i < p.length ; i++){
            System.out.println(i + 1 + "." + p[i].getName() + ":" + p[i].getPrice() +"원");
        }
    }

    // 결과화면 출력
    public void result(){
        System.out.println("남은 돈은 " + money + "원 입니다.");
    }
}
