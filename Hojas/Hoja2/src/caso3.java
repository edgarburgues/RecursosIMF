import java.util.Scanner;

public class caso3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte numeroMes;

		System.out.print("Introduce un mes de forma num�rica: ");
		numeroMes = sc.nextByte();
		if (numeroMes == 4 || numeroMes == 6 || numeroMes == 9 || numeroMes == 11) {
			System.out.print("Tiene 30 d�as");
		} else if (numeroMes == 2) {
			System.out.println("Tiene 28 d�as");
		} else {
			System.out.println("Tiene 31 d�as");
		}
		sc.close();
	}
}
