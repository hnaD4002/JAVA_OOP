package BTVN.Bai_2;

import java.util.Scanner;

public class Date {
	Scanner input = new Scanner(System.in);
	private Byte day, month;
	private int year;

	
	public Date() {
	}

	
	public Date(Byte day, Byte month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}


	public Byte getDay() {
		return day;
	}

	public void setDay(Byte day) {
		this.day = day;
	}

	public Byte getMonth() {
		return month;
	}

	public void setMonth(Byte month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void Nhap()
	{
		System.out.print("Day: ");
		day = input.nextByte();
		System.out.print("Month: ");
		month = input.nextByte();
		System.out.print("Year: ");
		year = input.nextInt();
	}
	// 28/04/2004
	// 0123456789
	public void Xuat()
	{
		String s = String.format("%d/%d/%d%-10s ", day, month, year, " ");
		if (s.charAt(2) != '/')
			s = "0" + s;
		if (s.charAt(3) != '0')
			s = s.substring(0, 3) + "0" + s.substring(3);
		while(s.charAt(9) == ' ')
			s = s.substring(0, 6) + "0" + s.substring(6);
		System.out.print(s);
	}
	
}
