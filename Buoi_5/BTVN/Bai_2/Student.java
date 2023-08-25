package BTVN.Bai_2;

import java.util.Scanner;

class Student {
	Scanner input = new Scanner(System.in);
	private String name, classs;
	private double score;
	private Faculty y;

	public Student() {
	}

	public Student(String name, String classs, double score, Faculty y)
	{
		this.name = name;
		this.classs = classs;
		this.score = score;
		this.y = y;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}
	public void setClasss(String classs)
	{
		this.classs = classs;
	}

	public String getClasss()
	{
		return classs;
	}
	public void setScore(double score)
	{
		this.score = score;
	}

	public double getScore()
	{
		return score;
	}
	public void setFaculty(Faculty y)
	{
		this.y = y;
	}

	public Faculty getFaculty()
	{
		return y;
	}
	public void Input() {
		y = new Faculty();
		System.out.print("Nhập tên sinh viên:  ");
		this.name = input.nextLine();
		System.out.print("Nhập lớp: ");
		this.classs = input.nextLine();
		System.out.print("Nhập điểm: ");
		this.score = input.nextDouble();
		y.Input();
	}
	public void Output()
	{
		System.out.printf("%-50s %-10s %.2-5f", name, classs, score);
		y.Output();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập số lượng sinh viên: ");
		int n = input.nextInt();
		Student sv[] = new Student[n];
		for (int i = 0; i < n; i++)
		{
			System.out.println("Nhập thông tin sinh viên thứ " + i + 1);
			sv[i] = new Student();
			sv[i].Input();
		}
		System.out.printf("%-50s %-10s %-5s %-30s %-30s %-30s %-30s\n","Họ và Tên", "Lớp", "Điểm", "Trường",
				"Ngày thành lập trường", "Khoa", "Ngày thành lập khoa");
		for(Student sinhvien : sv)
			sinhvien.Output();
		input.close();
	}
}
