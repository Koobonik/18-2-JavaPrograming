public class Circle {
    final double PI = 3.14159; // 원주
    private double radius; // 반지름
    public void setRadius(double r){ //setter
        this.radius = r;
    }
    public double getRadius(){ // getter
        return this.radius;
    }
    public double area(){ // 원의 넓이
        return PI * radius * radius;
    }
    public void showCircle(){
        System.out.println("원의 넓이는 " + area() + " 입니다.");
    }
}
