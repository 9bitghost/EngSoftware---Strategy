package Strategy;

public class Aritmetica implements ICalcMedia{
	
	public double CalculaMedia(double P1, double P2, double media) {
		return media = (P1 + P2)/2;
	}

	@Override
	public String Situacao(double media) {
		if (media >5) {
			return "Aprovado";
		}
		else {
			return "Reprovado";
		}
	}

}
