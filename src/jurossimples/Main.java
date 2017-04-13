package jurossimples;

import jurossimples.MyScanner;

public class Main {
	public static void main(String[] args) {
		MyScanner scanner = new MyScanner();

		System.out.println("Digite o montante: ");
		double montante = scanner.lerDecimal();

		System.out.println("Digite a taxa: ");
		double taxa = scanner.lerPorcentagem();

		System.out.println("Digite o número de períodos: ");
		int periodo = scanner.nextInt();

		int menu = 0;
		while (menu != 3) {
			System.out.println("Digite uma opção");
			System.out.println("1- Juros simples");
			System.out.println("2- Juros compostos");
			System.out.println("3- Sair");

			menu = scanner.nextInt();

			if (menu == 1) {

				System.out.println("R$ " + Calculadora.jurossimples(montante, taxa, periodo));

			}

			if (menu == 2) {

				System.out.println("R$ " + Calculadora.juroscompostos(montante, taxa, periodo));

			}
			break;
		}
	}
}
