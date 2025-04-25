package JavaBasic_Bai5;

import java.util.ArrayList;
import java.util.List;

public class Collection {
    private static List<String> addEmployee(String name, String age, String address, String phoneNumber) {
        List<String> employeeInfo = new ArrayList<>();
        employeeInfo.add(name);
        employeeInfo.add(age);
        employeeInfo.add(address);
        employeeInfo.add(phoneNumber);
        return employeeInfo;
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //Kiểm tra số chẵn, add vào ArrayList
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }

        //Duyệt giá trị trong ArrayList
        for (int i : list) {
            System.out.print(i + "\t");
        }

        System.out.println(" ");
        System.out.println("\n******** Thông tin nhân viên *********");
//        List<String> employeeInfo = new ArrayList<>();
//        employeeInfo.add("Kelly Tran");
//        employeeInfo.add("27 tuổi");
//        employeeInfo.add("Da Nang");
//        employeeInfo.add("Phone number: 0123456789");

        List<String> employee = addEmployee(
                "Kelly Trần",
                "27",
                "Da Nẵng",
                "0123456789"
        );

        for (String value : employee) {
            System.out.println(value);
        }
    }
}

