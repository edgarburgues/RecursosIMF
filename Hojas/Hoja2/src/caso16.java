
//Todas las sucesiones en FOR, WHILE y DO WHILE
public class caso16 {

	/**
	 *
	 */
	private static final String DO_WHILE = "DO WHILE";
	/**
	 *
	 */
	private static final String WHILE = "WHILE";

	public static void main(String[] args) {
		int i;

		// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

		for (i = 0; i <= 20; i++) {
			System.out.print(i + " ");
		}
		System.out.println("FOR");

		i = 0;
		while (i <= 20) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println(WHILE);
		i = 0;
		do {
			System.out.print(i + " ");
			i++;
		} while (i <= 20);
		System.out.println(DO_WHILE);
		System.out.println("----------------------------------");

		// 1 3 5 7 9 11 13 15 17 19
		for (i = 1; i <= 20; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println("FOR");

		i = 1;
		while (i <= 20) {
			System.out.print(i + " ");
			i += 2;
		}
		System.out.println(WHILE);
		i = 1;
		do {
			System.out.print(i + " ");
			i += 2;
		} while (i <= 20);
		System.out.println(DO_WHILE);
		System.out.println("----------------------------------");
		// 5 10 15 20 25 3035404550
		for (i = 5; i <= 50; i += 5) {
			System.out.print(i + " ");
		}
		System.out.println("FOR");

		i = 5;
		while (i <= 50) {
			System.out.print(i + " ");
			i += 5;
		}
		System.out.println(WHILE);
		i = 5;
		do {
			System.out.print(i + " ");
			i += 5;
		} while (i <= 50);
		System.out.println(DO_WHILE);
		System.out.println("----------------------------------");
		// 100 90 80 70 60 50 40 30 20 10 0
		for (i = 100; i >= 0; i -= 10) {
			System.out.print(i + " ");
		}
		System.out.println("FOR");

		i = 100;
		while (i >= 0) {
			System.out.print(i + " ");
			i -= 10;
		}
		System.out.println(WHILE);
		i = 100;
		do {
			System.out.print(i + " ");
			i -= 10;
		} while (i >= 0);
		System.out.println(DO_WHILE);
		System.out.println("----------------------------------");
		// 2 4 6 10 12 14 18 20 22 26
		// pares - multiplos de 8
		for (int j = 2; j <= 50; j += 2) {
			if (j % 8 != 0) {
				System.out.print(j + " ");
			}
		}
		System.out.println("FOR");

		i = 0;
		while (i <= 50) {
			if (i % 8 != 0) {
				System.out.print(i + " ");
			}
			i += 2;
		}
		System.out.println(WHILE);
		i = 0;
		do {
			if (i % 8 != 0) {
				System.out.print(i + " ");
			}
			i += 2;

		} while (i <= 50);
		System.out.println(DO_WHILE);

	}
}
