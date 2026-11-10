package baitaptuan6;
import java.util.Scanner;
import java.util.ArrayList;
public class Test {
		/*======YÊU CẦU 4=====*/
		public static void main (String[]args) {
			// Sửa ArrayList kiểu String thành Sach để chứa đối tượng sách
			ArrayList <Sach> danhsach = new ArrayList<>();
			Scanner sc = new Scanner (System.in);
			System.out.println("nhập số lượng sách cần nhập:");
			int n = sc.nextInt();
			sc.nextLine();
			
			for(int i = 1; i <= n; i++) {
				System.out.println("NHẬP CUỐN SÁCH THỨ "+i);
				Sach s = new Sach();
				System.out.println("Nhập mã sách:");
				s.masach = sc.nextLine();
				System.out.println("Nhập tiêu đề:");
				s.tieude = sc.nextLine();
				System.out.println("Nhập tác giả :");
				s.tacgia = sc.nextLine();
				System.out.println("Nhập năm xuất bản:");
				s.namsanxuat = sc.nextInt();
				sc.nextLine();
				System.out.println("Nhập số lượng:");
				s.soluong = sc.nextInt();
				sc.nextLine();
				
				danhsach.add(s);
			}
			
			System.out.println("\n========================================");
			System.out.println("     DANH SÁCH CÁC CUỐN SÁCH ĐÃ NHẬP");
			System.out.println("========================================");
			
			for(int i = 0; i < danhsach.size(); i++) {
				System.out.println("Sách thứ " + (i + 1) + ":");
				danhsach.get(i).hienthithongtin();
			}
	
	

	}

}
