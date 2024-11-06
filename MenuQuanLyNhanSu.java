package doAnCuoiKyHoanChinh;

import java.time.LocalDate;
import java.util.Scanner;

import doAnCuoiKy.ChuyenGiaNuocNgoai;
import doAnCuoiKy.ConNguoi;
import doAnCuoiKy.CongNhan;
import doAnCuoiKy.KySu;
import doAnCuoiKy.NhanVien;
import doAnCuoiKy.ThucTapSinh;

//System.out.println("\33[44m\nCÔNG TY LIÊN DOANH");
// lỗi 02, khi theme ko thành công
// return là trả về chương trình thoát khỏi do while
// continue trong default tiếp tục do while


public class MenuQuanLyNhanSu {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		XuLyTacVu qlns = new XuLyTacVu("danhSachToanBoNhanSu.dat");
		XuatMenuChon in = new XuatMenuChon();
		
		int chucNang;
		int loaiNhanSu;
		String nextNhap;
		
		// Mã nhân sự tự động
		int demCN = 0;
		int demNV = 0;
		int demKS = 0;
		int demCGNN = 0;		
		int demTTS = 0;
		int maNhanSu =0;
		

		// Xuất menu các chức năng của phỏng nhân sự
	
			in.xuatMenuChucNang();
			chucNang = nhap.nextInt();nhap.nextLine();
			
			
			
			
			// Các case của chức năng
			switch(chucNang) {
			
			case 1:	// Thêm mới nhân sự
			
					do {
						System.out.println("Nhập thông tin: ");
						loaiNhanSu = nhap.nextInt(); nhap.nextLine();
			

					System.out.print("Nhập họ và tên: "); 
					String hoVaTen = nhap.nextLine(); 
					System.out.print("Nhập năm sinh: ");
					int namSinh = nhap.nextInt(); nhap.nextLine();		            			
					System.out.print("Nhập giới tính: "); 
					String gioiTinh = nhap.nextLine();
					System.out.print("Nhập số điện thoại: "); 
					String soDienThoai = nhap.nextLine();



					// Phân loại nhân sự để nhập đúng thuộc tính
					switch(loaiNhanSu) {
					case 1:
						System.out.print("Nhập số bậc nghề: ");
						int bacNghe = nhap.nextInt(); nhap.nextLine();		
						ConNguoi cn = new CongNhan(hoVaTen, namSinh, gioiTinh, soDienThoai, bacNghe);
						qlns.themMoiNhanSu(cn); break;				
					case 2:
						System.out.print("Nhập công việc chính: ");
						String congViecChinh = nhap.nextLine();
						ConNguoi nv = new NhanVien(hoVaTen, namSinh, gioiTinh, soDienThoai,   congViecChinh);
						qlns.themMoiNhanSu(nv); break;		
					case 3:
						System.out.print("Nhập chuyên ngành: ");
						String chuyenNganh = nhap.nextLine();
						KySu ks = new KySu(hoVaTen, namSinh, gioiTinh, soDienThoai,  chuyenNganh);
						qlns.themMoiNhanSu(ks); break;				
					case 4:
						System.out.print("Nhập thêm chuyên ngành: ");
						String chuyenNganh2 = nhap.nextLine();	
						System.out.print("Nhập quốc tịch: ");
						String quocTich = nhap.nextLine();
						System.out.print("Nhập ngày hết hạn Visa: ");
						String ngayHetHanVisa = nhap.nextLine();
						ConNguoi cgnn = new ChuyenGiaNuocNgoai(hoVaTen, namSinh, gioiTinh, soDienThoai, chuyenNganh2, quocTich, ngayHetHanVisa);
						qlns.themMoiNhanSu(cgnn); break;
					case 5:
						System.out.print("Nhập tên trường Đại Học: ");
						String truongDaiHoc = nhap.nextLine();	
						ConNguoi tts = new ThucTapSinh(hoVaTen, namSinh, gioiTinh, soDienThoai,  truongDaiHoc);
						qlns.themMoiNhanSu(tts); break;
					default: 
						System.out.println("Chọn loại nhân sự không hợp lệ");		
						break; 
					}
				

				System.out.print("Bạn có muốn thêm tiếp không(yes/no)?: ");
				nextNhap = nhap.nextLine();
				
				// Đặt thêm vòng điều kiện để cho người dùng nhập tiếp
			}while(nextNhap.trim().equalsIgnoreCase("y") || nextNhap.trim().equalsIgnoreCase("yes")); break;
				// Kết thúc case 1 lớn (thêm nhân sự)
		
			case 2: qlns.lietKeThongTinNhanSu();
			}

				
	}
}

