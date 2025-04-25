package JavaBasic_Bai2;

public class Calculator {

    public int cong2So(int a, int b) {
        return (a + b);
    }

    public double tich2SoThuc(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.cong2So(10, 10));
        System.out.println(calculator.tich2SoThuc(5.0, 4.3));
    }
}

