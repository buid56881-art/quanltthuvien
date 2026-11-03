package baitaptuan6;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> danhSachSach = new ArrayList<>();

        danhSachSach.add("MS01, Lập trình Java, 10, 50000");
        danhSachSach.add("MS02, Cấu trúc dữ liệu, 5, 45000");

        System.out.println("--- THÊM SÁCH MỚI ---");
        System.out.print("Nhập mã sách: ");
        String ma = scanner.nextLine();
        System.out.print("Nhập tên sách: ");
        String ten = scanner.nextLine();
        System.out.print("Nhập số lượng: ");
        String sl = scanner.nextLine();
        System.out.print("Nhập giá: ");
        String gia = scanner.nextLine();
        danhSachSach.add(ma + ", " + ten + ", " + sl + ", " + gia);

        System.out.println("\n--- DANH SÁCH SÁCH ---");
        for (String sach : danhSachSach) {
            System.out.println(sach);
        }

       
        System.out.print("\nNhập mã sách cần tìm: ");
        String maTim = scanner.nextLine();
        boolean timThay = false;
        for (String sach : danhSachSach) {
            if (sach.startsWith(maTim + ",")) {
                System.out.println("Kết quả tìm kiếm: " + sach);
                timThay = true;
                break;
            }
        }
        if (!timThay) System.out.println("Không tìm thấy!");

       
        System.out.print("\nNhập mã sách cần sửa: ");
        String maSua = scanner.nextLine();
        for (int i = 0; i < danhSachSach.size(); i++) {
            if (danhSachSach.get(i).startsWith(maSua + ",")) {
                System.out.print("Nhập tên sách mới: ");
                String tenMoi = scanner.nextLine();
                System.out.print("Nhập số lượng mới: ");
                String slMoi = scanner.nextLine();
                System.out.print("Nhập giá mới: ");
                String giaMoi = scanner.nextLine();
                danhSachSach.set(i, maSua + ", " + tenMoi + ", " + slMoi + ", " + giaMoi);
                System.out.println("Đã cập nhật!");
                break;
            }
        }

      
        System.out.print("\nNhập mã sách cần xóa: ");
        String maXoa = scanner.nextLine();
        danhSachSach.removeIf(sach -> sach.startsWith(maXoa + ","));
        System.out.println("Danh sách sau khi xử lý: " + danhSachSach);

        scanner.close();
    }
}