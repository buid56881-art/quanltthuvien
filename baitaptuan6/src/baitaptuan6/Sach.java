package baitaptuan6;
import java.util.Scanner;
import java.util.ArrayList;
public class Sach {
		protected   String masach;
		protected  String ngaysanxuat;
		protected  String nhaxuatban;
		protected  Double dongia;
		protected  int soluong;
public Sach () {}

	
	public Sach(String masach, String ngaysanxuat, String nhaxuatban, Double dongia, int soluong) {

	this.masach = masach;
	this.ngaysanxuat = ngaysanxuat;
	this.nhaxuatban = nhaxuatban;
	this.dongia = dongia;
	this.soluong = soluong;
}


	
	
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}


	public void hienthithongtin() {
		System.out.println("mã sách :"+ masach);
		System.out.println(" ngày sản xuất:"+ ngaysanxuat);
		System.out.println("nhà xuất bản:"+ nhaxuatban);		
		System.out.println("đơn giá :"+ dongia);
		System.out.println("sốlượng :"+ soluong);
			
			
		}
		
	public void nhap() {
	Scanner sc= new Scanner (System.in);
		System.out.println("Nhập mã sách:");
		masach=(sc.nextLine());
		System.out.println("Nhập ngày sản xuất:");
		ngaysanxuat=(sc.nextLine()); 
		System.out.println("Nhập nhà xuất bản  :");
		nhaxuatban=(sc.nextLine()); 
		System.out.println(" Nhập đơn giá bán:");
		dongia=(sc.nextDouble()); 
		sc.nextLine();
		System.out.println("Nhập số lượng:");
		soluong=(sc.nextInt());
		sc.nextLine();
		
	}
	
		
	


}


