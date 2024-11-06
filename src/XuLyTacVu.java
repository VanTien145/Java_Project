package doAnCuoiKyHoanChinh;

import java.util.ArrayList;

public class XuLyTacVu {
	// Khai báo thuộc tính của lớp
	protected ArrayList<ConNguoi> danhSachConNguoi;
	protected String tenTapTin;
	
	// Khởi dựng lớp
	public XuLyTacVu(String tenTapTin) {
		this.tenTapTin = tenTapTin;
		
		DocTapTin doc = new DocTapTin(tenTapTin);
		danhSachConNguoi = doc.docDSConNguoi();
		if(danhSachConNguoi == null) 
			danhSachConNguoi = new ArrayList<ConNguoi>();
	}
	
	
	// Triển khai các phương thức
	// Thêm nhân sự thành công trả về true, thất bại thành false
	public boolean themMoiNhanSu(ConNguoi cn) {
		danhSachConNguoi.add(cn);
		GhiVaoTapTin ghi = new GhiVaoTapTin(tenTapTin, danhSachConNguoi);
		return ghi.ghiDSConNguoi();
	}
	
	
	public void lietKeThongTinNhanSu() {
		if(danhSachConNguoi.size() == 0) {
			System.out.println("Không có nhân sự nào!");
		}else
			for (ConNguoi cn : danhSachConNguoi) 
				System.out.println(cn.toString());
	}
	
	
	public void lietKeThongTinNhanSu(ArrayList<ConNguoi> danhSachNhanSu) {
		if(danhSachConNguoi.size() == 0) {
			System.out.println("Không có nhân sự nào!");
		}else
			for (ConNguoi cn : danhSachNhanSu) 
				System.out.println(cn.toString());
	}
	
	
	public ArrayList<ConNguoi> timKiemTheoHoTen(String hoVaTen){
		ArrayList<ConNguoi> ketQua = new ArrayList<>();
		if(danhSachConNguoi.size() != 0) {
			System.out.println("Không có nhân sự nào!");
		}else
			for (ConNguoi cn : danhSachConNguoi) 
				if(cn.getHoTen().contains(hoVaTen))
					ketQua.add(cn);
		return ketQua;
	}
	
	
//	public ArrayList<ConNguoi> timKiemTheoHo(String ho){
//		
//	}
	
	public boolean xoaNhanSuTheoSoDienThoai(String soDienThoai) {
		boolean xoaThanhCong = false;
		for (ConNguoi cn : danhSachConNguoi) 
			if(cn.getSoDienThoai().equals(soDienThoai)) {
				danhSachConNguoi.remove(cn);
				xoaThanhCong = true;
				break;
			}
		
		boolean ghiThanhCong = false;
		if(xoaThanhCong == true) {
			GhiVaoTapTin ghi = new GhiVaoTapTin(tenTapTin, danhSachConNguoi);
			ghiThanhCong = ghi.ghiDSConNguoi();
		}
			
		return (xoaThanhCong && ghiThanhCong);
	}
	
}
