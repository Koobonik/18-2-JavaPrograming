package JavaExam.WrapperEX;

public class WrapperClassEx {
    public static void main(String [] args) {
        Integer i = new Integer(10);
        char c = '4';
        Double d = new Double(3.1234566);
        System.out.println(Character.toLowerCase('A'));
        if(Character.isDigit(c))
            System.out.println(Character.getNumericValue(c));
        System.out.println();
    }
}
