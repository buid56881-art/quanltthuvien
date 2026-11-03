package baitaptuan6;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> dsMaSach = new ArrayList<>();

   
        dsMaSach.add("MS01");
        dsMaSach.add("MS02");
        dsMaSach.add("MS03");
        System.out.println("Đã thêm 3 mã sách vào danh sách.");

       
        System.out.println("\n--- DANH SÁCH MÃ SÁCH ---");
        for (String ma : dsMaSach) {
            System.out.println(ma);
        }

 
        System.out.print("\nNhập mã sách cần tìm: ");
        String maTim = scanner.nextLine();
        if (dsMaSach.contains(maTim)) {
            System.out.println("Mã sách '" + maTim + "' có trong danh sách.");
        } else {
            System.out.println("Không tìm thấy mã sách '" + maTim + "'.");
        }

   
        System.out.print("\nNhập mã sách cần xóa: ");
        String maXoa = scanner.nextLine();
        if (dsMaSach.remove(maXoa)) {
            System.out.println("Đã xóa thành công mã sách: " + maXoa);
        } else {
            System.out.println("Xóa thất bại! Không có mã sách: " + maXoa);
        }

        System.out.println("\nDanh sách mã sách còn lại: " + dsMaSach);
        scanner.close();
    }
}
