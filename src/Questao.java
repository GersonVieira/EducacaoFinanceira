import java.util.List;

public class Questao {
	String enunciado;
	List<String> alternativas;
	int cont;
	public Questao(String enunciado,List<String> alternativas) {
		
		this.enunciado=enunciado;
		this.alternativas=alternativas;
		this.cont=0;
		
	}
	
	public List<String> getAlternativas(){
	
		return alternativas;
	}
	

}
