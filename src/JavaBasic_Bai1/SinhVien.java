package JavaBasic_Bai1;

public class SinhVien {
    String studentName = "Kelly Tran";
    static String university = "Foreign Language University";

    public static void main(String[] args) {
        double mathScore = 8.5;
        double englishScore = 7.5;
        double literatureScore = 6.0;

        System.out.println("Điểm Toán: " + mathScore);
        System.out.println("Điểm Anh: " + englishScore);
        System.out.println("Điểm Văn: " + literatureScore);

        SinhVien sinhVien = new SinhVien();
        System.out.println("Tên: " + sinhVien.studentName);
        System.out.println("Trường: " + university);

        //Lấy tên Class.Variables khi gọi biến từ Class khác
        System.out.println("Địa chỉ: " + ThongTin.ADDRESS);
        System.out.println("Số điện thoại: " + ThongTin.PHONE_NUMBER);
    }
}

