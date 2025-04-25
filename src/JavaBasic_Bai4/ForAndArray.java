package JavaBasic_Bai4;

public class ForAndArray {

    public static void main(String[] args) {
//        for (int i = 0; i <= 50; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
        int array[] = new int[26];
        int index = 0;
        for (int j = 0; j <= 50; j++) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
                array[index] = j; //Gán giá trị số chẳng vào vị trí mảng tuần tự
                index++; //Tăng biến chỉ mục lên 1 đơn vị
            }
        }
        //Duyệt mảng
          //+Cách 1: Vòng lặp for-each (for cải tiến)
//        System.out.println(" ");
//        for (int value: array){
//            System.out.println(value);
//        }
          //+Cách 2: Vòng lặp for cơ bản
        for (int x = 0; x < array.length; x++){
            System.out.println(array[x] + " ");
        }
    }
}
