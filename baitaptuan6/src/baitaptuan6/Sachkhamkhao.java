package baitaptuan6;

import java.util.Scanner;

public class Sachkhamkhao extends Sach {
	public Double thue;

	public Sachkhamkhao() {
	
	}

	public Sachkhamkhao(Double thue ,String masach, String ngaysanxuat, String nhaxuatban, Double dongia, int soluong) {
		super(masach, ngaysanxuat, nhaxuatban, dongia, soluong);
		this.thue=thue;
	
	}
	public Double thanhtien() {
		return soluong*dongia+thue;
	}
@Override
public  void hienthithongtin() {
	super.hienthithongtin();
	System.out.println("thue"+thue);
}
@Override
public void nhap() {
	super.nhap();
	Scanner sc=new Scanner (System.in);
	System.out.println("nhập thuế:");
	thue=sc.nextDouble();
	sc.nextLine();
}

	
	
	
}
