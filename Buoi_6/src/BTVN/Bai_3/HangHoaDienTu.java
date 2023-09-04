package BTVN.Bai_3;

import java.util.ArrayList;
import java.util.Scanner;

public class HangHoaDienTu extends HangHoa{
	private int thoiGianBaoHanh, congSuat;

	public HangHoaDienTu(int thoiGianBaoHanh, int congSuat) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.congSuat = congSuat;
	}

	public HangHoaDienTu(String maHang, String tenHang, float soLuong, float donGia, VatLieu[] dsVL,
			int thoiGianBaoHanh, int congSuat) {
		super(maHang, tenHang, soLuong, donGia, dsVL);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.congSuat = congSuat;
	}

	public HangHoaDienTu()
	{
	}

	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public int getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(int congSuat) {
		this.congSuat = congSuat;
	}
	@Override
	public void Nhap()
	{
		super.Nhap();
		System.out.print("Thời gian bảo hành: ");
		thoiGianBaoHanh = input.nextInt();
		System.out.print("Công suất: ");
		congSuat = input.nextInt();
	}
	@Override
	public void Xuat()
	{
		super.Xuat();
		System.out.printf("Thời gian bào hành: %d\nCông suất: %d\n", thoiGianBaoHanh, congSuat);
	}

	public float tongTien() {
		return getSoLuong() * getDonGia();
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<HangHoaDienTu> arr = new ArrayList<>();
		System.out.print("Nhập số lượng hàng hoá: ");
		int n = input.nextInt();
		for (int i = 0; i < n; i++)
		{
			HangHoaDienTu a = new HangHoaDienTu();
			a.Nhap();
			arr.add(a);
		}
		float sumMoney = 0.0f;
		System.out.println("================Hàng Hoá Điện Tử================");
		for (HangHoaDienTu hangHoaDienTu : arr) {
			hangHoaDienTu.Xuat();
			sumMoney += hangHoaDienTu.tongTien();
			System.out.println("================================================");

		}
		System.out.printf("Thành tiền: %.2f VNĐ\n", sumMoney);

		input.close();
	}

}
