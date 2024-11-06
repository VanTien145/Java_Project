package doAnCuoiKyHoanChinh;

public class KySu extends ConNguoi {
	// Khai báo thuộc tính lớp
	private String chuyenNganh;

	// Khởi dựng lớp
	public KySu(String hoTen, int namSinh, String gioiTinh, String soDienThoai, String chuyenNganh) {
		super(hoTen, namSinh, gioiTinh, soDienThoai);
		this.chuyenNganh = chuyenNganh;
	}
	
	// Triển khai cái phương thức
	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	
	@Override
	public String toString() {
		return "Kỹ sư: "+hoTen+", "+namSinh+", "+gioiTinh+", "+soDienThoai+", "+chuyenNganh;
	}
	
}	
