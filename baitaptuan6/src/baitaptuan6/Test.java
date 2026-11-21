package baitaptuan6;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		ArrayList<Sach> danhsach = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Bạn muốn nhập loại sách nào?");
		System.out.println("1. Sách giáo khoa");
		System.out.println("2. Sách tham khảo");
		int chon = sc.nextInt();

		System.out.print("Nhập số lượng muốn thêm: ");
		int soLuongNhap = sc.nextInt();
		sc.nextLine(); 

		if (chon == 1) {
			for (int i = 0; i < soLuongNhap; i++) {
				System.out.println("--- Nhập sách giáo khoa thứ " + (i + 1) );
				Sachgiaokhoa sgk = new Sachgiaokhoa();
				sgk.nhap();
				danhsach.add(sgk);
			}
		} else if (chon == 2) {
			for (int i = 0; i < soLuongNhap; i++) {
				System.out.println("--- Nhập sách tham khảo thứ " + (i + 1) );
				Sachkhamkhao stk = new Sachkhamkhao();
				stk.nhap();
				danhsach.add(stk);
			}
		} else {
			System.out.println("Lựa chọn không hợp lệ!");
		}

		for (Sach s : danhsach) {
		    s.hienthithongtin();
		    if (s instanceof Sachgiaokhoa) {
		        System.out.println("Thành tiền: " + ((Sachgiaokhoa) s).thanhtien());
		    } else if (s instanceof Sachkhamkhao) {
		        System.out.println("Thành tiền: " + ((Sachkhamkhao) s).thanhtien());
		    }
		    System.out.println("------------------------");
		}

		sc.close();
	}
}