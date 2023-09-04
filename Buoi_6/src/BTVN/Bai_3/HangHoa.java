package BTVN.Bai_3;

import java.util.Scanner;

public class HangHoa {
	Scanner input = new Scanner(System.in);
	private String maHang, tenHang;
	private float soLuong, donGia;
	private VatLieu[] dsVL;

	public HangHoa() {
	}

	public HangHoa(String maHang, String tenHang, float soLuong, float donGia, VatLieu[] dsVL) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.dsVL = dsVL;
	}

	public String getMaHang() {
		return maHang;
	}

	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public float getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(float soLuong) {
		this.soLuong = soLuong;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public VatLieu[] getDsVL() {
		return dsVL;
	}

	public void setDsVL(VatLieu[] dsVL) {
		this.dsVL = dsVL;
	}

	public void Nhap() {
		System.out.print("Mã hàng: ");
		maHang = input.nextLine();
		System.out.print("Tên hàng: ");
		tenHang = input.nextLine();
		System.out.print("Số lượng: ");
		soLuong = input.nextFloat();
		System.out.print("Đơn giá: ");
		donGia = input.nextFloat();
		System.out.print("Số lượng vật liệu: ");
		Byte n = input.nextByte();
		dsVL = new VatLieu[n];
		for (Byte i = 0; i < n; i++) {
			dsVL[i] = new VatLieu();
			dsVL[i].Nhap();
		}
	}

	public void Xuat() {
		System.out.printf("Mã Hàng: %s \nTên Hàng: %s\n", maHang, tenHang);
		System.out.printf("Số lượng: %3f \n Đơn Giá: %.3f\n", soLuong, donGia);
		System.out.println("----------------Danh Sách Vật Liệu--------------------");
		System.out.printf("%-20s %-20s %-20s\n", "Tên", "Màu Sắc", "Độ Cứng");
		for (VatLieu vatLieu : dsVL) {
			vatLieu.Xuat();
		}
	}
}
