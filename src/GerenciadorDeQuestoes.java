import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeQuestoes {
	List<Questao> questoes;
	Questao atual;
	BancoDeQuestoes banco;
	
	int indexAtual;
	public GerenciadorDeQuestoes() {
		this.questoes=new ArrayList<Questao>();
		indexAtual=0;
	}
	public Alternativa nextAlternativa() {
		if(indexAtual >= atual.getAlternativas().size()) {
			this.indexAtual=0;
		}
		return atual.getAlternativas().get(indexAtual++);
	}
	public Questao getQuestaoBanco() {
		return null;
	}
	public List<Questao> getQuestoesBanco(){
		return null;
	}
	public List<Questao> getDesafio() {
		// TODO Auto-generated method stub
		return null;
	}
}
