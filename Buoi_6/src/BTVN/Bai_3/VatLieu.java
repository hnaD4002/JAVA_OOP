package BTVN.Bai_3;

import java.util.Scanner;

public class VatLieu {
	Scanner input = new Scanner(System.in);
	private String ten, mauSac;
	private int doCung;

	
	public VatLieu() {
	}
	
	public VatLieu(String ten, String mauSac, int doCung) {
		this.ten = ten;
		this.mauSac = mauSac;
		this.doCung = doCung;
	}

	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getMauSac() {
		return mauSac;
	}
	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
	public int getDoCung() {
		return doCung;
	}
	public void setDoCung(int doCung) {
		this.doCung = doCung;
	}

	public void Nhap()
	{
		System.out.print("Tên: ");
		ten = input.nextLine();
		System.out.print("Màu sắc: ");
		mauSac = input.nextLine();
		System.out.print("Dộ cứng: ");
		doCung = input.nextInt();
	}

	public void Xuat()
	{
		System.out.printf("%-20s %-20s %-20d\n", ten, mauSac, doCung);
	}

	
	
}
