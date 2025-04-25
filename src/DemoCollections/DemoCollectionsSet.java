package DemoCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoCollectionsSet {
    public static void main(String[] args) {
        //Khai báo kiểu dữ liệu SET
        Set<String> menu = new HashSet<>();

        //Thêm dữ liệu
        menu.add("Project");
        menu.add("Dashboard");
        menu.add("Customer");
        menu.add("Tasks");
        menu.add("Sales");
        menu.add("Project");

        System.out.println(menu.contains("Tasks123"));
        menu.remove("Sales");
        System.out.println(menu.size());


        System.out.println("Các phần tử của Set");
        System.out.print("\t" + menu + "\n");

        System.out.println("\n==================");
        // Show list through Iterator (Vòng lặp)
        Iterator<String> itr = menu.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }

        System.out.println("\n==================");
        // Show list through for-each (Vòng lặp cải tiến)
        for (String obj : menu) {
            System.out.println(obj);
        }

    }
}
