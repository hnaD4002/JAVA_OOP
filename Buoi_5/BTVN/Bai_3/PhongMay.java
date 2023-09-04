package BTVN.Bai_3;

import java.util.Scanner;

class PhongMay {
	Scanner input = new Scanner(System.in);
	private String maPhong, tenPhong;
	private double dienTich;
	private QuanLy x;
	private Computer[] y;
	private int n;

	public PhongMay() {
	}

	public PhongMay(String maPhong, String tenPhong, double dienTich, QuanLy x, Computer[] y, int n) {
		this.maPhong = maPhong;
		this.tenPhong = tenPhong;
		this.dienTich = dienTich;
		this.x = x;
		this.n = n;
		this.y = y;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	public String getMaPhong() {
		return this.maPhong;
	}

	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}

	public String getTenPhong() {
		return this.tenPhong;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}

	public double getDienTich() {
		return this.dienTich;
	}

	public void setInt(int n) {
		this.n = n;
	}

	public int getInt() {
		return this.n;
	}

	public void setQuanLy(QuanLy x) {
		this.x = x;
	}

	public QuanLy getQuanLy() {
		return this.x;
	}

	public void setComputer(Computer[] y) {
		this.y = y;
	}

	public Computer[] getComputer() {
		return this.y;
	}

	public void Nhap() {
		System.out.print("Nhập mã phòng: ");
		this.maPhong = input.nextLine();
		System.out.print("Nhập tên phòng: ");
		this.tenPhong = input.nextLine();
		System.out.print("Nhập diện tích: ");
		this.dienTich = input.nextDouble();
		x = new QuanLy();
		x.Input();
		System.out.print("Nhập số lượng máy: ");
		n = input.nextInt();
		y = new Computer[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin máy thứ " + (i + 1));
			y[i] = new Computer();
			y[i].Nhap();
		}
	}

	public void Xuat() {
		System.out.printf("%-10s %-20s %.2-10f", maPhong, tenPhong, dienTich);
		x.Output();
		System.out.println("\n============================ THÔNG TIN MÁY ============================");
		System.out.printf("%-10s %-10s %-20s\n", "Mã Máy", "Tên Máy", "Tình Trạng");
		for (int i = 0; i < n; i++) {
			y[i].Xuat();
		}
	}

	public static void main(String[] args) {
		PhongMay a = new PhongMay();
		a.Nhap();
		System.out.println("============================ THÔNG TIN PHÒNG MÁY ============================");
		System.out.printf("%-10s %-20s %-10s %-10s %-30s\n", "Mã phòng", "Tên Phòng", "Diện Tích", "Mã Quản Lý",
				"Tên Quản Lý");
		a.Xuat();
	}

	public Scanner getInput() {
		return input;
	}

	public void setInput(Scanner input) {
		this.input = input;
	}

	public QuanLy getX() {
		return x;
	}

	public void setX(QuanLy x) {
		this.x = x;
	}

	public Computer[] getY() {
		return y;
	}

	public void setY(Computer[] y) {
		this.y = y;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
}
