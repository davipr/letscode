package jurossimples;

public class Calculadora {
	private double taxa;
	private int periodo;
	private double montante;

	public static double jurossimples(double montante, double taxa, int periodo) {
		return montante * (taxa * periodo);

	}

	public static double juroscompostos(double montante, double taxa, int periodo) {
		return montante * Math.pow(taxa, periodo);

	}

}
