package desafiometodo1;

public class CalculoDeConversao {

	double fator;
	double diferenca;
	double grausCelsius10;
	double grausCelsius30;
	double grausFahrenheit10;
	double grausFahrenheit30;

	double calcularConversaoGraus10() {
		double grausFahrenheit10 = (grausCelsius10 * fator) + diferenca;
		return grausFahrenheit10;
	}

	double calcularConversaoGraus30() {
		double grausFahrenheit30 = (grausCelsius30 * fator) + diferenca;
		return grausFahrenheit30;
	}
}