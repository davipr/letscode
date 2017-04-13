package jurossimples;

import java.util.Scanner;

public class MyScanner {
	public Scanner scanner;

	public MyScanner() {
		scanner = new Scanner(System.in);
	}

	public double nextDouble() {
		String valor = scanner.nextLine();

		return Double.parseDouble(valor);
	}

	public int nextInt() {
		String valor = scanner.nextLine();

		return Integer.parseInt(valor);
	}

	public String nextLine() {
		return scanner.nextLine();
	}

	public double lerDecimal() {
		try {
			String valor = scanner.nextLine();
			valor = valor.replace(",", ".");
			return Double.parseDouble(valor);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}

	public double lerPorcentagem() {
		try {
			String valor = scanner.nextLine();
			valor = valor.replace("%", "");
			valor = valor.replace(",", ".");
			return Double.parseDouble(valor) / 100;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}

	}
}