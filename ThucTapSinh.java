package doAnCuoiKyHoanChinh;

public class ThucTapSinh extends ConNguoi {
	// Khai báo thuộc
	private String truongDaiHoc;
	
	// Khởi dựng lớp
	public ThucTapSinh(String hoTen, int namSinh, String gioiTinh, String soDienThoai, String truongDaiHoc) {
		super(hoTen, namSinh, gioiTinh, soDienThoai);
		this.truongDaiHoc = truongDaiHoc;
	}
	
	// Triển khai các phương thức
	public String getTruongDaiHoc() {
		return truongDaiHoc;
	}

	public void setTruongDaiHoc(String truongDaiHoc) {
		this.truongDaiHoc = truongDaiHoc;
	}
	
	@Override
	public String toString() {
		return "Công nhân: "+hoTen+", "+namSinh+", "+gioiTinh+", "+soDienThoai+", "+truongDaiHoc;
	}
}
