package Bai_2;

import java.util.Scanner;

public class Address {
	Scanner input = new Scanner(System.in);
	private String city, district;

	public Address() {
	}

	public Address(String city, String district) {
		this.city = city;
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void Nhap() {
		System.out.print("City: ");
		city = input.nextLine();
		System.out.print("District: ");
		district = input.nextLine();
	}

	public void Xuat() {
		System.out.printf("%-20s%-20s", city, district);
	}
}
