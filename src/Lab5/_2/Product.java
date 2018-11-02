package Lab5._2;

public class Product {
    private int price;
    private String name;

    Product(String name, int price){ // 생성
        this.name = name;
        this.price = price;
    }

    // 가격 반환
    public int getPrice() {
        return price;
    }

    // 상품명 반환
    public String getName() {
        return name;
    }
}
