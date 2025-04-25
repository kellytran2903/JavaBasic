package Arrays;

public class XuLyChuoi {
    public static void main(String[] args) {

        String S1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        String S2 = "Duis aute irure dolor in reprehenderit in voluptate.";

        //Cắt chuỗi (Lấy tuwf vị trí nào)
        System.out.println(S1.substring(10));
        System.out.println(S1.substring(6, 11));

        //Ghép chuỗi
        System.out.println(S1 + "=" + S2);

        //Chuyển kiểu in hoa thường
        System.out.println(S2.toUpperCase());
        System.out.println(S1.toLowerCase());

        //Trim
        String S3 = "   Test Automation   ";
        System.out.println(S3.trim());

        //Độ dài chuỗi
        System.out.println("Độ dài chuỗi: " + S1.length());

        //Tìm kiếm kí tự
        System.out.println(S1.charAt(3));
        System.out.println(S1.indexOf("m"));

        //So sánh chuỗi
           //+(So sánh bằng)
        String S4 = "Test Automation";
        String S5 = "test automation";
        System.out.println(S4.equals(S5));

           //+(So sánh chứa)
        System.out.println(S4.contains("Automation"));

        //So sánh mà bỏ qua hoa thường
        System.out.println(S4.equalsIgnoreCase(S5));
    }
}
