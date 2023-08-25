package BTVN.Bai_3;

import java.util.Scanner;

class Computer {
	Scanner input = new Scanner(System.in);
	private String maMay, tenMay, tinhTrang;

	public Computer() {
	}

	public void setMa(String maMay)
	{
		this.maMay = maMay;
	}

	public String getMa()
	{
		return this.maMay;
	}
	public void setName(String tenMay)
	{
		this.tenMay = tenMay;
	}

	public String getName()
	{
		return this.tenMay;
	}
	public void setTinhTrang(String tinhTrang)
	{
		this.tinhTrang = tinhTrang;
	}

	public String getTinhTrang()
	{
		return this.tinhTrang;
	}
	public Computer(String maMay, String tenMay, String tinhTrang)
	{
		this.maMay = maMay;
		this.tenMay = tenMay;
		this.tinhTrang = tinhTrang;
	}

	public void Nhap()
	{
		System.out.print("Nhập mã máy: ");
		this.maMay = input.nextLine();
		System.out.print("Nhập tên máy: ");
		this.tenMay = input.nextLine();
		System.out.print("Nhập tình trạng: ");
		this.tinhTrang = input.nextLine();
	}

	public void Xuat() {
		System.out.printf("%-10s %-10s %-20s\n", maMay, tenMay, tinhTrang);
	}
}
