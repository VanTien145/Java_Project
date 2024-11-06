package doAnCuoiKyHoanChinh;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DocTapTin {
	// Khai báo thuộc tính lớp
	private String tenTapTin;

	// Khởi dựng lớp
	public DocTapTin(String tenTapTin) {
		this.tenTapTin = tenTapTin;
	}
	
	// Đọc danhSachConNguoi từ tập tin, thành công trả về true, thất bại trả về false
	public ArrayList<ConNguoi> docDSConNguoi(){
		ArrayList<ConNguoi> danhSachConNguoi = null;
		
		try {
			FileInputStream f = new FileInputStream(tenTapTin);
			ObjectInputStream o = new ObjectInputStream(f);
			danhSachConNguoi = (ArrayList<ConNguoi>)o.readObject();
			
			o.close();
			f.close();
			
			return danhSachConNguoi;
		}catch(Exception e) {
			return null;
		}
	}
}	
