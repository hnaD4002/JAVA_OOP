//package BTVN_Buoi3;
/* Ly thuyet
 * 1. Mang
 * 		<data> + [] + <name> = new + <data>[count];
 * 		example: 
 * 			int[] arr = new int[10];
 * 			int[] arr_ = {1, 2, 4, 5, 7};
 * 		-Truy van phan tu trong mang:
 * 			+ First value -> index = 0
 * 			+ Last value -> index = n-1
 * 		- Duyet array
 * 			+ Dung for
 * 			+ Dung for-each
 * 2. Ham
 * 		Tuong tu nhu C++
 * 		Khac la khi muon su dung ham thi can khai bao doi tuong chua ham de goi no! - Khong muon thi su dung tu khoa static
 * 
 * 3. Thu vien Math
 * 		
 * 4. String
 * 		- Khai bao: String nameString;
 * 		- Cac ham trong string:
 * 			+ charAt(index) -> Lay ra ky tu o vi tri index
 * 			+ a.contains(string b) -> return true or false 
 * 				true khi a chua b va nguoc lai
 * 			+ length() -> do dai
 * 			+ a.compareTo(b) -> So sanh -> return 1(bang nhau) or so_() : Phan biet chu hoa va chu thuong
 * 			+ a.compareToIgnoreCase(b): Giong nhu tren nhung khong phan biet chu hoa chu thuong
 * 			+ a.equals(b) -> So sanh -> return true or false
 * 			+ a.concat(b) : noi a va b vao voi nhau 
 * 			+ isEmpty() -> check xem string co rong hay khong
 * 			+ 
 * 			+ ...
 * 5. Hang so (const)
 * 	Khai bao voi tu khoa final
*/
import java.util.Scanner;

 class Online{
	// final: giong const trong C++
	Scanner input = new Scanner(System.in);
	final double pi = 3.14;
	final float pii = 3.14f;
	static int Giai_Thua_1(int n){
		if(n == 0)
			return 1;
		return n * Giai_Thua_1(n-1);
	}
	int Tinh_1(int n){
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum += Giai_Thua_1(i);
		}
		return sum;
	}
	static int Tinh_2(int n){
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum += Online.Giai_Thua_1(i);
		}
		return sum;
	}
	void LayName(){
		System.out.print("Nhap ho va ten: ");
		String str = input.nextLine();
		if(str.lastIndexOf(" ") == -1){
			System.out.println("Khong biet nua!");
		}else{
			System.out.println(str.substring(str.lastIndexOf(" ") + 1));
			System.out.println(str.substring(0, str.lastIndexOf(" ")));
		}
	}
	public static void main(String[] args){
		Online obj = new Online();
		Scanner input = new Scanner(System.in);
		obj.LayName();
		int n;
		do{
			System.out.print("Nhap n: ");
			n = input.nextInt();
		}while(n <= 0);
		System.out.println("P = " + obj.Tinh_1(n));
		System.out.println("P = " + Online.Tinh_2(n));
		input.close();
	}
 }

 // Note: Ham static chi dung duoc cac ham static khac thui