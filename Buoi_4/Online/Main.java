package Online;

public class Main {
	
	public static void main(String[] args) {
		String formattedOutput = String.format("%-10s%-20s%-10s", "STT", "Tên", "Tuổi");
System.out.println(formattedOutput);

formattedOutput = String.format("%-10s%-20s%-10s", "1", "Nguyễn Văn A", "25");
System.out.println(formattedOutput);
	}
}
