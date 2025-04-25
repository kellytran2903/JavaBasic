package Arrays;

public class DemoMang2 {
    public static void main(String[] args) {
        int number2[] = {5, 7, 10, 20, 30, 99};
        System.out.println("Lenght: " + number2.length);
        System.out.println(number2[4]);
        System.out.println("===========================");

        for (int i = 0; i < number2.length; i++) {
            System.out.println(number2[i]);
        }

        String dataCustomer[] = {"Hồng", "Hoa", "Huệ"};
        System.out.println(dataCustomer[0]);
        System.out.println(dataCustomer[1]);
        System.out.println(dataCustomer[2]);

        boolean check = true;
        for (int i = 0; i < dataCustomer.length; i++) {
            if(dataCustomer[i].equals("Quân")){
                check = true;
                break;
            }
            else {
                check = false;
            }
        }
        if (check == true){
            System.out.println("Tìm thấy");
        } else {
            System.out.println("Không tìm thấy");
        }
    }
}
