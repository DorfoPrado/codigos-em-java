import java.util.Scanner;

public class RevertString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();

		String output = "";
		int length = s.length() - 1;
		for(int i = length; i >= 0; i--) {
			char charAt = s.charAt(i);
			String valueOf = String.valueOf(charAt);
			output = output.concat(valueOf);
		}
		System.out.print(output);
	}
}
