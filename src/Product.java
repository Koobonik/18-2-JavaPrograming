public class Product {
    private int price;
    private String name;

    Product(String name, int price){ // 생성
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
