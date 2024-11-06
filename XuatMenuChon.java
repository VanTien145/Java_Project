package doAnCuoiKyHoanChinh;

public class XuatMenuChon {
	
	public XuatMenuChon() {
	}
	
	public void xuatMenuChucNang() {
			System.out.println("       _________________________________________________________________________________________________ ");
			System.out.println("      |                                                                                                 |");
		 	System.out.println("      |                                    MENU QUẢN LÝ NHÂN SỰ                                         |");
            System.out.println("      |_________________________________________________________________________________________________|");
            System.out.println("      |                                              |                                                  |");
            System.out.println("      | 1. Thêm mới nhân sự                          |  9. Liệt kê tuổi của tất cả nhân sự              |");            
            System.out.println("      | 2. Liệt kê tất cả nhân sự trong công ty      | 10. Xem người có mức lương cao nhất              |");           
            System.out.println("      | 3. Liệt kê theo đối tượng                    | 11. Liệt kê tên của từng nhân sự theo alphabet   |");            
            System.out.println("      | 4. Tìm kiếm theo họ và tên                   | 12. Tính lương trung bình của cả công ty         |");         
            System.out.println("      | 5. Tìm kiếm theo tên                         | 13. Tìm nhân sự vào công ty sớm nhất             |");       
            System.out.println("      | 6. Tìm kiếm theo mã nhân viên                | 14. Thoát khỏi MENU                              |");      
            System.out.println("      | 7. Sửa thông tin nhân sự                     |                                                  |");
            System.out.println("      | 8. Xóa hồ sơ nhân sự đã thôi việc            |                                                  |");
            System.out.println("      |______________________________________________|__________________________________________________|");
			System.out.print(" >> Chức năng bạn chọn là: ");
            //Nên làm ngang cho dài chức năng
	}
	
	public void xuatMenuLoaiNhanSu() {
		System.out.println("       ____________________________");
		System.out.println("       |                          |");
		System.out.println("       | 1. Công nhân             |");
	 	System.out.println("       | 2. Nhân viên             |");
	 	System.out.println("       | 3. Kỹ sư                 |");
	 	System.out.println("       | 4. Chuyên gia nước ngoài |");
	 	System.out.println("       | 5. Thực tập sinh         |");
        System.out.println("       |__________________________|");
        System.out.print(" >> Chọn loại nhân sự cần thêm: ");
	}
	
	public void xuatMenuThongTinCanSuaCuaCongNhan() {
		System.out.println("----Chọn phần cần sửa----");
		System.out.println(" 1. Họ và tên");
		System.out.println(" 2. Năm sinh");
		System.out.println(" 3. Giới tính");
		System.out.println(" 4. Số điện thoại");
		System.out.println(" 5. Mã nhân sự (Tự động theo quy định và không được đổi)");
		System.out.println(" 6. Lương");
		System.out.println(" 7. Bậc nghề");
		System.out.print(" >> Nhập thông tin cần sửa: ");
	}
	
	public void xuatMenuThongTinCanSuaCuaNhanVien() {
		System.out.println("----Chọn phần cần sửa----");
		System.out.println(" 1. Họ và tên");
		System.out.println(" 2. Năm sinh");
		System.out.println(" 3. Giới tính");
		System.out.println(" 4. Số điện thoại");
		System.out.println(" 5. Mã nhân sự (Tự động theo quy định và không được đổi)");
		System.out.println(" 6. Lương");
		System.out.println(" 7. Công việc chính ");
		System.out.print(" >> Nhập thông tin cần sửa: ");
	}
	
	public void xuatMenuThongTinCanSuaCuaKySu() {
		System.out.println("----Chọn phần cần sửa----");
		System.out.println(" 1. Họ và tên");
		System.out.println(" 2. Năm sinh");
		System.out.println(" 3. Giới tính");
		System.out.println(" 4. Số điện thoại");
		System.out.println(" 5. Mã nhân sự (Tự động theo quy định và không được đổi)");
		System.out.println(" 6. Lương");
		System.out.println(" 7. Chuyên ngành");
		System.out.print(" >> Nhập thông tin cần sửa: ");
	}
	
	public void xuatMenuThongTinCanSuaCuaChuyenGiaNuocNgoai() {
		System.out.println("----Chọn phần cần sửa----");
		System.out.println(" 1. Họ và tên");
		System.out.println(" 2. Năm sinh");
		System.out.println(" 3. Giới tính");
		System.out.println(" 4. Số điện thoại");
		System.out.println(" 5. Mã nhân sự (Tự động theo quy định và không được đổi)");
		System.out.println(" 6. Lương");
		System.out.println(" 8. Chuyên ngành");
		System.out.println(" 9. Quốc tịch");
		System.out.println(" 10. Ngày hết hạn Visa");
		System.out.print(" >> Nhập thông tin cần sửa: ");
	}
	
	public void xuatMenuThongTinCanSuaCuaThucTapSinh() {
		System.out.println("----Chọn phần cần sửa----");
		System.out.println("1. Họ và tên");
		System.out.println("2. Năm sinh");
		System.out.println("3. Giới tính");
		System.out.println("4. Số điện thoại");
		System.out.println("5. Mã nhân sự (Tự động theo quy định và không được đổi)");
		System.out.println("6. Lương");
		System.out.println("7. Trường Đại Học");
		System.out.print(" >> Nhập thông tin cần sửa: ");
	}
	
	
	
}
