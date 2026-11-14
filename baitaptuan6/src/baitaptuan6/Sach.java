package baitaptuan6;
import java.util.Scanner;
public class Sach {
		private  String masach;
		private  String tieude;
		private  String tacgia;
		private  int namsanxuat;
		private  int soluong;
public Sach () {}
public Sach (String masach, String tieude,String tacgia,int namsanxuat,int soluong) {
	this.masach=masach;
	this.tieude=tieude;
	this.tacgia=tacgia;
	this.namsanxuat=namsanxuat;
	this.soluong=soluong;
	
}
	
	public String getMasach() {
		return masach;
	}
	public void setMasach(String masach) {
		this.masach = masach;
	}
	public String getTieude() {
		return tieude;
	}
	public void setTieude(String tieude) {
		this.tieude = tieude;
	}
	public String getTacgia() {
		return tacgia;
	}
	public void setTacgia(String tacgia) {
		this.tacgia = tacgia;
	}
	public int getNamsanxuat() {
		return namsanxuat;
	}
	public void setNamsanxuat(int namsanxuat) {
		if (namsanxuat>0 && namsanxuat<=2026 )
			this.namsanxuat = namsanxuat;
		else 
			System.out.println("nhập lại năm sản xuất");
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		if(soluong>=0)
			this.soluong = soluong;
		else
			System.out.println("nhập lại số lượng");
		
	}
	
	public void hienthithongtin() {
		System.out.println("mã sách là:"+ masach);
		System.out.println("tiêu đề là:"+ tieude);
		System.out.println("tác giả là:"+ tacgia);		
		System.out.println("năm sản xuất là:"+ namsanxuat);
		System.out.println("sốlượng là:"+ soluong);
			
			
		}
		
		
		
	


}


