package Strategy;

public class Disciplina{
	
	public double media;
	public String nome;
	public double P1;
	public double P2;
	public String situacao;
	private ICalcMedia calculo;
	
    public Disciplina(ICalcMedia calculo) {
        this.calculo = calculo;
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
	
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	public String getSituacao() {
		return situacao;
	}

    public void CalcularMedia() {
        this.media = calculo.CalculaMedia(this.P1, this.P2);
        this.situacao = calculo.Situacao(this.media);
    }

}
