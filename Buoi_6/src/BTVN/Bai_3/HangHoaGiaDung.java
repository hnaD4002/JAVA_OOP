package BTVN.Bai_3;

import java.util.ArrayList;
import java.util.Scanner;

public class HangHoaGiaDung extends HangHoa{
	private String chucNang;

	public String getChucNang() {
		return chucNang;
	}

	public void setChucNang(String chucNang) {
		this.chucNang = chucNang;
	}

	public HangHoaGiaDung(String chucNang) {
		this.chucNang = chucNang;
	}

	public HangHoaGiaDung(String maHang, String tenHang, float soLuong, float donGia, VatLieu[] dsVL, String chucNang) {
		super(maHang, tenHang, soLuong, donGia, dsVL);
		this.chucNang = chucNang;
	}

	public HangHoaGiaDung()
	{
	}
	
	@Override
	public void Nhap()
	{
		super.Nhap();
		System.out.print("Chức năng: ");
		chucNang = input.nextLine();
	}
	@Override
	public void Xuat()
	{
		super.Xuat();
		System.out.println("Chức năng: " + chucNang);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<HangHoaGiaDung> arr = new ArrayList<>();
		System.out.print("Nhập số lượng hàng hoá: ");
		int n = input.nextInt();
		for (int i = 0; i < n; i++)
		{
			HangHoaGiaDung a = new HangHoaGiaDung();
			a.Nhap();
			arr.add(a);
		}
		System.out.println("================Hàng Hoá Gia Dụng================");
		for (HangHoaGiaDung a : arr) {
			a.Xuat();
			System.out.println("================================================");
		}
		input.close();
	}
}
