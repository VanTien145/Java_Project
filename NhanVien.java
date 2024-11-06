package doAnCuoiKyHoanChinh;

public class NhanVien extends ConNguoi{
	// Khai báo thuộc tính
	private String congViecChinh;
	
	// Khởi dựng lớp
	public NhanVien(String hoTen, int namSinh, String gioiTinh, String soDienThoai, String congViecChinh) {
		super(hoTen, namSinh, gioiTinh, soDienThoai);
		this.congViecChinh = congViecChinh;
	}
	
	// Triển khai các phương thức
	public String getCongViecChinh() {
		return congViecChinh;
	}

	public void setCongViecChinh(String congViecChinh) {
		this.congViecChinh = congViecChinh;
	}
	
	@Override
	public String toString() {
		return "Công nhân: "+hoTen+", "+namSinh+", "+gioiTinh+", "+soDienThoai+", "+congViecChinh;
	}
	
}
