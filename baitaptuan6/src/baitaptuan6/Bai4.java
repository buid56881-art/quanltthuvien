package baitaptuan6;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> danhSachSach = new ArrayList<>();
        int chon;

        do {
            System.out.println("\n========== MENU QUẢN LÝ THƯ VIỆN ==========");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị sách");
            System.out.println("3. Tìm sách");
            System.out.println("4. Xóa sách");
            System.out.println("5. Sửa sách");
            System.out.println("6. Tính tổng số lượng");
            System.out.println("7. Tính tổng giá trị");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng (1-8): ");
            chon = Integer.parseInt(scanner.nextLine());

            switch (chon) {
                case 1:
                    System.out.print("Nhập mã sách: ");
                    String ma = scanner.nextLine();
                    System.out.print("Nhập tên sách: ");
                    String ten = scanner.nextLine();
                    System.out.print("Nhập số lượng: ");
                    int sl = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập giá: ");
                    double gia = Double.parseDouble(scanner.nextLine());
                    danhSachSach.add(ma + ";" + ten + ";" + sl + ";" + gia);
                    System.out.println("-> Thêm sách thành công!");
                    break;

                case 2:
                    System.out.println("\n--- DANH SÁCH SÁCH ---");
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Danh sách đang trống!");
                    } else {
                        for (String s : danhSachSach) {
                            String[] p = s.split(";");
                            System.out.printf("Mã: %-6s | Tên: %-18s | SL: %-4s | Giá: %s\n", p[0], p[1], p[2], p[3]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nhập mã sách cần tìm: ");
                    String maTim = scanner.nextLine();
                    boolean found = false;
                    for (String s : danhSachSach) {
                        if (s.startsWith(maTim + ";")) {
                            System.out.println("Tìm thấy: " + s);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Không tìm thấy sách!");
                    break;

                case 4:
                    System.out.print("Nhập mã sách cần xóa: ");
                    String maXoa = scanner.nextLine();
                    boolean daXoa = danhSachSach.removeIf(s -> s.startsWith(maXoa + ";"));
                    if (daXoa) System.out.println("-> Đã xóa thành công!");
                    else System.out.println("Không tìm thấy mã sách để xóa.");
                    break;

                case 5:
                    System.out.print("Nhập mã sách cần sửa: ");
                    String maSua = scanner.nextLine();
                    boolean daSua = false;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        if (danhSachSach.get(i).startsWith(maSua + ";")) {
                            System.out.print("Nhập tên sách mới: ");
                            String tenMoi = scanner.nextLine();
                            System.out.print("Nhập số lượng mới: ");
                            int slMoi = Integer.parseInt(scanner.nextLine());
                            System.out.print("Nhập giá mới: ");
                            double giaMoi = Double.parseDouble(scanner.nextLine());
                            danhSachSach.set(i, maSua + ";" + tenMoi + ";" + slMoi + ";" + giaMoi);
                            System.out.println("-> Cập nhật thành công!");
                            daSua = true;
                            break;
                        }
                    }
                    if (!daSua) System.out.println("Không tìm thấy mã sách!");
                    break;

                case 6:
                    int tongSL = 0;
                    for (String s : danhSachSach) {
                        String[] p = s.split(";");
                        tongSL += Integer.parseInt(p[2]);
                    }
                    System.out.println("Tổng số lượng sách trong thư viện: " + tongSL);
                    break;

                case 7:
                    double tongGiaTri = 0;
                    for (String s : danhSachSach) {
                        String[] p = s.split(";");
                        int quantity = Integer.parseInt(p[2]);
                        double price = Double.parseDouble(p[3]);
                        tongGiaTri += quantity * price;
                    }
                    System.out.println("Tổng giá trị sách trong thư viện: " + tongGiaTri);
                    break;

                case 8:
                    System.out.println("Đã thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (chon != 8);

        scanner.close();
    }
}

