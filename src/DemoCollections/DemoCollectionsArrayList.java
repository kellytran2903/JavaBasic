package DemoCollections;

import java.util.ArrayList;
import java.util.List;

public class DemoCollectionsArrayList {
    public static void main(String[] args) {

        //Khai báo kiểu dữ liệu Array List
        //Được phép lưu nhiều giá trị trùng lặp

        List<String> menu = new ArrayList<>();


        //Thêm dữ liệu
        menu.add("Project");
        menu.add("Dashboard");
        menu.add("Customer");
        menu.add("Tasks");
        menu.add("Sales");
        menu.add("Project");

        //Xoá dữ liệu
        menu.remove(3);

        //Cập nhật dữ liệu
        menu.add(3, "Task123");
        menu.set(4, "Reports");

        //Get giá trị theo chỉ mục
        //Vị trí bắt đầu là 0
        System.out.println(menu.get(3));

        //Kiểm tra dữ liệu
        System.out.println(menu.contains("Dashboard"));

        System.out.println("=====================");
        //Duyệt dữ liệu kiểu ArrayList
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i));
        }

        System.out.println("=====================");
        int j = 0;
        for (String value : menu) {
            System.out.println(menu.get(j));
            j++;
        }
        System.out.println("***********************************");
        List<String> menu2 = new ArrayList<>();
        menu2.addAll(menu); //Thêm nguyên bộ (collection) data trong menu vào menu2
        for (int i = 0; i < menu2.size(); i++) {
            System.out.println(menu2.get(i));
        }
    }
}
