package JavaBasic_Bai3;

public class IfElse {
   static int number = 100;

    public static void compareNumber(int n){
        if(n == number){
            System.out.println("n bằng 100");
        } else if (n < number) {
            System.out.println("n nhỏ hơn 100");
        } else {
            System.out.println("n lớn hơn 100");
        }
    }

    public static void main(String[] args) {
        compareNumber(1000);
    }
}
