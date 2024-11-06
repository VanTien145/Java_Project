package doAnCuoiKyHoanChinh;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GhiVaoTapTin {
	// Khai báo thuộc tính lớp
	private String tenTapTin;
	private ArrayList<ConNguoi> danhSachConNguoi;
	
	// Khởi dựng lớp
	public GhiVaoTapTin(String tenTapTin, ArrayList<ConNguoi> danhSachConNguoi) {
		this.tenTapTin = tenTapTin;
		this.danhSachConNguoi = danhSachConNguoi;
	}
	
	// Ghi danhSachConNguoi vào tập tin, thành công trả về "true", thất bại trả về false
	public boolean ghiDSConNguoi() {
		try {
			FileOutputStream f = new FileOutputStream(tenTapTin, false);
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(danhSachConNguoi);
			
			o.close();
			f.close();
			
			return true;
		}catch(Exception e){
			System.out.println("Có lỗi xảy ra. Mã lỗi [101]: "+ e.getStackTrace());
			return false;
		}
	}
}
