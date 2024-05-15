package Strategy;

public class Disciplina{
	
	private double media;
	private String nome;
	private double P1;
	private double P2;
	private String Situacao;
	
	public Disciplina(Aritmetica calculo) {
	
	}
	
	public Disciplina(Geometrica calculo){
		
	}
	
	public void setMedia(double media) {
		this.media = media;
	}
	
	public double getMedia() {
		return media;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setP1(double P1) {
		this.P1 = P1;
	}
	
	public double getP1() {
		return P1;
	}
	
	public void setP2(double P2) {
		this.P2 = P2;
	}
	
	public double getP2() {
		return P2;
	}
	
	public void setSituacao(String Situacao) {
		this.Situacao = Situacao;
	}
	
	public String getSituacao() {
		return Situacao;
	}

	public void CalcularMedia() {
		
	}

}
