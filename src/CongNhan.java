package doAnCuoiKyHoanChinh;

public class CongNhan extends ConNguoi{
	// Khai báo thuộc tính lớp
	private int bacNghe;
	
	// Khởi dựng lớp
	public CongNhan(String hoTen, int namSinh, String gioiTinh, String soDienThoai, int bacNghe) {
		super(hoTen, namSinh, gioiTinh, soDienThoai);
		this.bacNghe = bacNghe;
	}
	
	// Triển khai các phương thức
	public int getBacNghe() {
		return bacNghe;
	}

	public void setBacNghe(int bacNghe) {
		this.bacNghe = bacNghe;
	}
	
	@Override
	public String toString() {
		return "Công nhân: "+hoTen+", "+namSinh+", "+gioiTinh+", "+soDienThoai+", "+bacNghe;
	}
	
	
	
	
	
	
	
	
}
