package BTVN.Bai_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person
{
	private String id, classs, school;

	public Student(String id, String classs, String school) {
		this.id = id;
		this.classs = classs;
		this.school = school;
	}

	public Student(String name, String address, Date birthDay, Byte age, String id, String classs, String school) {
		super(name, address, birthDay, age);
		this.id = id;
		this.classs = classs;
		this.school = school;
	}

	public Student()
	{
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClasss() {
		return classs;
	}

	public void setClasss(String classs) {
		this.classs = classs;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public void Nhap()
	{
		System.out.print("Mã Sinh Viên: ");
		id = input.nextLine();
		super.Nhap();
		System.out.print("Lớp: ");
		classs = input.nextLine();
		System.out.print("Trường: ");
		school = input.nextLine();
	}
	@Override
	public void Xuat()
	{
		System.out.printf("%-20s ", id);
		super.Xuat();
		System.out.printf("%-20s %-20s\n", classs, school);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>();
		System.out.print("Nhập số lượng sinh viên: ");
		int n = input.nextInt();
		for(int i = 0; i < n; i++)
		{
			Student a = new Student();
			a.Nhap();
			students.add(a);
		}
		System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s \n", "Mã sinh viên", "Họ và Tên", "Tuổi", "Địa chỉ", "Ngày sinh", "Lớp", "Trường");
		for (Student student : students) { 
			student.Xuat();
		}
		input.close();
	}
	
}
