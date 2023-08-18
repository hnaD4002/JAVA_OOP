import java.util.Scanner;

class Student{
	private String maSinhVien;
	private String hoTen;
	private float diemToan;
	private float diemHoa;
	private float diemLy;
	Scanner input = new Scanner(System.in);
	public Student(){}
	public Student(String maSinhVien, String hoTen, float diemToan, float diemHoa, float diemLy){
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}
	public float diemTB(){
		return (diemHoa+diemToan+diemLy)/3.0f;
	}
	public void NhapThongTin(){
		System.out.print("Nhap ma sinh vien: ");
		maSinhVien = input.nextLine();
		System.out.print("Nhap ho ten: ");
		hoTen = input.nextLine();
		System.out.print("Nhap diem toan: ");
		diemToan = input.nextFloat();
		System.out.print("Nhap diem ly: ");
		diemLy = input.nextFloat();
		System.out.print("Nhap diem hoa: ");
		diemHoa = input.nextFloat();
	}
	public void XuatThongTin(){
		String format = String.format("%-30s %-30s  %-30.2f %-30.2f %-30.2f %-30.2f", maSinhVien, hoTen, diemToan, diemLy, diemHoa, diemTB());
		System.out.println(format);
	}

	public void setMaSinhVien(String id){
		this.maSinhVien = id;
	}
	public String getMaSinhVien(){
		return maSinhVien;
	}
	public void setHoTen(String id){
		this.hoTen = id;
	}
	public String getHoTen(){
		return hoTen;
	}
	public void setDiemToan(float id){
		this.diemToan = id;
	}
	public float getDiemToan(){
		return diemToan;
	}
	public void setDiemLy(float id){
		this.diemLy = id;
	}
	public float getDiemLy(){
		return diemLy;
	}
	public void setDiemHoa(float id){
		this.diemHoa = id;
	}
	public float getDiemHoa(){
		return diemHoa;
	}
}
public class Bai_3 {
	public static void main(String[] args) {
		Student[] student = new Student[1];
		for(int i = 0; i < 1; i++){
			student[i] = new Student();
			student[i].NhapThongTin();
		}
		String format = String.format("%-30s %-30s  %-30s %-30s %-30s %-30s", "Ma sinh vien", "Ho va ten", "Diem Toan", "Diem Ly", "Diem Hoa", "Diem Trung Binh");
		System.out.println(format);
		for(int i = 0; i < 1; i++){
			student[i].XuatThongTin();
		}
	}
}