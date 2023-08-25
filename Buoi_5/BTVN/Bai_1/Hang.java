import java.util.Scanner;
class Hang {
	Scanner input = new Scanner(System.in);
	private String idHang, nameHang;
	private NSX x;

	public Hang() {
	}

	public Hang(String idHang, String nameHang, NSX x)
	{
		this.idHang = idHang;
		this.nameHang = nameHang;
		this.x = x;
	}

	// public void Hang(String idHang, String nameHang, String idNSX, String nameNSX, String addressNSX)
	// {
	// 	this.idHang = idHang;
	// 	this.nameHang = nameHang;
	// 	this.x = new NSX(idNSX, nameNSX, addressNSX);
	// }
	
	public void setName(String nameHang) {
		this.nameHang = nameHang;
	}

	public String setName() {
		return this.nameHang;
	}
	
	public void setId(String idHang) {
		this.idHang = idHang;
	}

	public String setId() {
		return this.idHang;
	}

	public void setNSX(NSX x)
	{
		this.x = x;
	}
	public NSX getNSX()
	{
		return this.x;
	}

	public void Nhap()
	{
		System.out.print("Nhap ma hang: ");
		this.idHang = input.nextLine();
		System.out.print("Nhap ten hang: ");
		this.nameHang = input.nextLine();
		x = new NSX();
		x.Nhap();
	}

	public void Xuat()
	{
		System.out.printf("%-10s %-20s ", idHang, nameHang);
		x.Xuat();
	}
	public static void main(String[] args) {
		Hang a = new Hang();
		a.Nhap();
		System.out.printf("%-10s %-20s %-10s %-10s %-10s\\n", "Ma Hang", "Ten Hang", "Ma NSX", "Ten NSX", "Dia chi NSX");
		a.Xuat();
	}
}
