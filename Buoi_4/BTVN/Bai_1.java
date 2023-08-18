import java.util.Scanner;

class Sach{
	private  String id;
	private  String name;
	private  String tacGia;
	private  String nhaXuatBan;
	private int namXuatBan;
	Scanner input = new Scanner(System.in);
	public Sach(){}
	public Sach(String id, String name, String tacGia, String nhaXuatBan, int namXuatBan){
		this.id = id;
		this.name = name;
		this.tacGia = tacGia;
		this.nhaXuatBan = nhaXuatBan;
		this.namXuatBan = namXuatBan;
	}

	public void NhapThongTin(){
		System.out.print("Nhap ma sach: ");
		id = input.nextLine();
		System.out.print("Nhap ten sach: ");
		name = input.nextLine();
		System.out.print("Nhap tac gia: ");
		tacGia = input.nextLine();
		System.out.print("Nhap nha xuat ban: ");
		nhaXuatBan = input.nextLine();
		System.out.print("Nhap nam xuat ban: ");
		namXuatBan = input.nextInt();
	}
	public void XuatThongTin(){
		String format = String.format("%-30s %-30s  %-30s %-30s %-30d", id, name, tacGia, nhaXuatBan, namXuatBan);
		System.out.println(format);
	}

	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setName(String id){
		this.name = id;
	}
	public String getNme(){
		return name;
	}
	public void setTacGia(String id){
		this.tacGia = id;
	}
	public String getTacGia(){
		return tacGia;
	}
	public void setNhaSanXuat(String id){
		this.nhaXuatBan = id;
	}
	public String getNhaSanXuat(){
		return nhaXuatBan;
	}
	public void setNamSanXuat(int id){
		this.namXuatBan = id;
	}
	public int getNamXuatBan(){
		return namXuatBan;
	}
}
public class Bai_1 {
	public static void main(String[] args) {
		Sach[] sach = new Sach[5];
		for(int i = 0; i < 5; i++){
			sach[i] = new Sach();
			sach[i].NhapThongTin();
		}
		String format = String.format("%-30s %-30s  %-30s %-30s %-30s", "Ma sach", "Ten sach", "Tac gia", "Nha xuat ban", "Nam xuat ban");
		System.out.println(format);
		for(int i = 0; i < 5; i++){
			sach[i].XuatThongTin();
		}
	}
}