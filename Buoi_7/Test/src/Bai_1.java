import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input: ");
		String a = input.nextLine();
		int sum = 0;
		for(int i = 0; i < a.length(); i++)
		{
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
				int check = 1;
				int temp = a.charAt(i) - 48;
				if(i > 0)
				{
					if (a.charAt(i - 1) == '-')
						check = -1;
				}
				int j = i + 1;
				while (j < a.length() && a.charAt(j) <= '9' && a.charAt(j) >= '0') {
					temp *= 10;
					temp += a.charAt(j) - 48;
					j++;
					i++;
				}
				sum += temp*check;
			}
		}
		System.out.println("Output: " + sum);
		input.close();
	}

}