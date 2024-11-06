package doAnCuoiKyHoanChinh;

public class ChuyenGiaNuocNgoai extends ConNguoi{
	// Khai báo các thuộc tính
	private String chuyenNganh;
	private String quocTich;
	private String ngayHetHanVisa;
	
	// Khởi dựng lớp
	public ChuyenGiaNuocNgoai(String hoTen, int namSinh, String gioiTinh, String soDienThoai, String chuyenNganh,
			String quocTich, String ngayHetHanVisa) {
		super(hoTen, namSinh, gioiTinh, soDienThoai);
		this.chuyenNganh = chuyenNganh;
		this.quocTich = quocTich;
		this.ngayHetHanVisa = ngayHetHanVisa;
	}

	// Triển khai các phương thức
	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	public String getNgayHetHanVisa() {
		return ngayHetHanVisa;
	}

	public void setNgayHetHanVisa(String ngayHetHanVisa) {
		this.ngayHetHanVisa = ngayHetHanVisa;
	}
	
	@Override
	public String toString() {
		return "Công nhân: "+hoTen+", "+namSinh+", "+gioiTinh+", "+soDienThoai+", "+chuyenNganh+", "+quocTich
				+", "+ngayHetHanVisa;
	}
	
}
