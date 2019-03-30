import java.util.List;

public class Questao {
	private String enunciado;
	private List<Alternativa> alternativas;
	private String dica;
	private int cont;
	public Questao(String enunciado,List<Alternativa> alternativas, String dica) {
		
		this.enunciado=enunciado;
		this.alternativas=alternativas;
		this.cont=0;
		this.dica=dica;
	}
	public String getEnunciado() {
		return this.enunciado;
	}
	public List<Alternativa> getAlternativas(){
	
		return alternativas;
	}

	public String getDica() {
		
		return dica;
	}
	

}
