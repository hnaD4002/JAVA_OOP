package Bai_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Classroom {
	Scanner input = new Scanner(System.in);
	private int classId;
	private int numberOfStudent;
	ArrayList<Student> listStudents;
	
	public Classroom(int classId, int numberOfStudent, ArrayList<Student> listStudents) {
		this.classId = classId;
		this.numberOfStudent = numberOfStudent;
		this.listStudents = listStudents;
	}
	public Classroom() {
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public int getNumberOfStudent() {
		return numberOfStudent;
	}
	public void setNumberOfStudent(int numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}
	public ArrayList<Student> getListStudents() {
		return listStudents;
	}
	public void setListStudents(ArrayList<Student> listStudents) {
		this.listStudents = listStudents;
	}

	public void Nhap() {

		System.out.print("ID class: ");
		classId = input.nextInt();
		System.out.print("Number of class: ");
		numberOfStudent = input.nextInt();
		listStudents = new ArrayList<>();
		for (int i = 0; i < numberOfStudent; i++) {
			Student a = new Student();
			a.Nhap();
			listStudents.add(a);
		}
	}

	public void Xuat() {
		System.out.println("Class ID: " + classId);
		System.out.println("Number of class: " + numberOfStudent);
		System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "ID", "Name", "Age", "Gender", "City",
				"District", "GPA");
		for (Student student : listStudents) {
			student.Xuat();
		}
	}

	public ArrayList<Student> searchByName(String name) {
		ArrayList<Student> searchName = new ArrayList<>();
		for (Student student : listStudents) {
			if (name.equals(student.getName()) == true) {
				searchName.add(student);
			}
		}
		return searchName;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Classroom a = new Classroom();
		a.Nhap();
		System.out.println("---------------------ClassRoom---------------------");
		a.Xuat();
		System.out.println("---------------------------------------------------");
		System.out.print("Search by Name: ");
		String name = input.nextLine();
		ArrayList<Student> students = new ArrayList<>();
		students.addAll(a.searchByName(name));
		System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n", "ID", "Name", "Age", "Gender", "City",
				"District", "GPA");
		for (Student student : students) {
			student.Xuat();
		}
		input.close();
	}
	
}