package doAnCuoiKyHoanChinh;

import java.io.Serializable;;

public class ConNguoi implements Serializable {
	private static final long serialVersionUID = 2L;
	 
	// Khai báo thuộc tính lớp
	protected String hoTen;
	protected int namSinh;
	protected String gioiTinh;
	protected String soDienThoai;
	
	// Khởi dựng lớp đầy đủ
	public ConNguoi(String hoTen, int namSinh, String gioiTinh, String soDienThoai) {
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
	}
	
	// Khởi dựng thiếu thuộc tính số điện thoại
	public ConNguoi(String hoTen, int namSinh, String gioiTinh) {
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = "";
	}
	
	// Khởi dựng thiếu thuộc tính giới tính
	public ConNguoi(String hoTen, int namSinh) {
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.gioiTinh = "";
		this.soDienThoai = "";
	}
	
	// Triển khai các phương thức
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	
}
