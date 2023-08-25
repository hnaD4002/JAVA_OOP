package BTVN.Bai_3;

import java.util.Scanner;

class QuanLy {
	Scanner input = new Scanner(System.in);
	private String maQuanLy, nameQuanLy;
	
	public QuanLy() {
	}

	public QuanLy(String maQuanLy, String nameQuanLy)
	{
		this.maQuanLy = maQuanLy;
		this.nameQuanLy = nameQuanLy;
	}
	
	public void setMa(String maQuanLy) {
		this.maQuanLy = maQuanLy;
	}

	public String getMa() {
		return this.maQuanLy;
	}
	
	public void setName(String nameQuanLy) {
		this.nameQuanLy = nameQuanLy;
	}

	public String getName() {
		return this.nameQuanLy;
	}

	public void Input()
	{
		System.out.print("Nhập mã quản lý: ");
		maQuanLy = input.nextLine();
		System.out.print("Nhập tên quản lý: ");
		nameQuanLy = input.nextLine();
	}

	public void Output()
	{
		System.out.printf("%-10s %-30s", maQuanLy, nameQuanLy);
	}
}
