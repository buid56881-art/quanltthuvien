package baitaptuan6;
import java.util.Scanner;
public class Sachgiaokhoa extends Sach {
	public String tinhtrang;

	public Sachgiaokhoa() {
	}

	public Sachgiaokhoa(String tinhtrang,String masach, String ngaysanxuat, String nhaxuatban, Double dongia, int soluong) {
		super(masach, ngaysanxuat, nhaxuatban, dongia, soluong);
		this.tinhtrang=tinhtrang;
	}
	public double thanhtien() {
		if(this.tinhtrang.equalsIgnoreCase("mới"))
			return soluong*dongia;
			else 
				if(this.tinhtrang.equalsIgnoreCase("cũ"))
					return soluong*dongia*0.5;
	return 0;
				
		
	}
@Override
public  void hienthithongtin() {
	super.hienthithongtin();
	System.out.println("tình trạng" +tinhtrang);
}
@Override 
public void nhap() {
	super.nhap(); 
   
	Scanner sc=new Scanner(System.in);
	System.out.println("Nhập tình trạng");
		tinhtrang=sc.nextLine();
	
}


	
	
	
	

}
