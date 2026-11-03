package baitaptuan6;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] soLuong = new int[5];

        // Nhập số lượng của 5 cuốn sách
        System.out.println("--- NHẬP SỐ LƯỢNG CHO 5 CUỐN SÁCH ---");
        for (int i = 0; i < soLuong.length; i++) {
            System.out.print("Nhập số lượng sách thứ " + (i + 1) + ": ");
            soLuong[i] = scanner.nextInt();
        }

        // Hiển thị số lượng
        System.out.println("\n--- DANH SÁCH SỐ LƯỢNG ---");
        for (int i = 0; i < soLuong.length; i++) {
            System.out.println("Sách " + (i + 1) + ": " + soLuong[i]);
        }

        // Tính tổng và tìm số lượng lớn nhất
        int tong = 0;
        int max = soLuong[0];
        for (int sl : soLuong) {
            tong += sl;
            if (sl > max) {
                max = sl;
            }
        }

        System.out.println("\nTổng số lượng sách: " + tong);
        System.out.println("Số lượng sách lớn nhất: " + max);

        scanner.close();
    }
}