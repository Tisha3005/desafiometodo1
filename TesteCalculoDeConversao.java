package desafiometodo1;

public class TesteCalculoDeConversao {

	public static void main(String[] args) {

		CalculoDeConversao grausCelsius10 = new CalculoDeConversao();
		grausCelsius10.grausCelsius10 = 10;
		grausCelsius10.fator = 9.0 / 5.0;
		grausCelsius10.diferenca = 32;

		CalculoDeConversao grausCelsius30 = new CalculoDeConversao();
		grausCelsius30.grausCelsius30 = 30;
		grausCelsius30.fator = 9.0 / 5.0;
		grausCelsius30.diferenca = 32;

		double conversao10 = grausCelsius10.calcularConversaoGraus10();
		double conversao30 = grausCelsius30.calcularConversaoGraus30();

		System.out.println(grausCelsius10.grausCelsius10 + " graus celsius são " + conversao10 + " graus fahrenheit");
		System.out.println(grausCelsius30.grausCelsius30 + " graus celsius são " + conversao30 + " graus fahrenheit");

	}
}