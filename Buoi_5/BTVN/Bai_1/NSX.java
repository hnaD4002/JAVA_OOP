import java.util.Scanner;

class NSX {
	Scanner input = new Scanner(System.in);
	private String idNSX, nameNSX, addressNSX;

	public NSX() {
	}

	public NSX(String idNSX, String nameNSX, String addressNSX)
	{
		this.idNSX = idNSX;
		this.nameNSX = nameNSX;
		this.addressNSX = addressNSX;
	}

	public void setId(String idNSX)
	{
		this.idNSX = idNSX;
	}

	public String setId()
	{
		return this.idNSX;
	}
	public void setName(String nameNSX)
	{
		this.nameNSX = nameNSX;
	}

	public String setName()
	{
		return this.nameNSX;
	}
	public void setAddress(String address)
	{
		this.addressNSX = address;
	}

	public String setAddress()
	{
		return this.addressNSX;
	}

	public void Nhap()
	{
		System.out.print("Nhap ma NSX: ");
		this.idNSX = input.nextLine();
		System.out.print("Nhap ten NSX: ");
		this.nameNSX = input.nextLine();
		System.out.print("Nhap dia chi NSX: ");
		this.addressNSX = input.nextLine();
	}

	public void Xuat()
	{
		System.out.printf("%-10s %-10s %-10s\n", this.idNSX, this.nameNSX, this.addressNSX);
	}
}