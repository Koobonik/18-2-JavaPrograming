package JavaExam;

public class Overriding {
    public static void main(String[] args){
        Professor a = new Professor();
        a.setPhone("010-1234-1234");
        System.out.println(a.getPhone());
        Person p = a;
        System.out.println(p.getPhone());
    }
}
