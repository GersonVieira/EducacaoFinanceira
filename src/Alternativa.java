
public class Alternativa {
	boolean status;
	String texto;
	String justificativa;
	
	public Alternativa(boolean status, String texto, String justificativa) {
		this.status = status;
		this.texto = texto;
		this.justificativa = justificativa;
	}

	public boolean isStatus() {
		return status;
	}

	public String getTexto() {
		return texto;
	}

	public String getJustificativa() {
		return justificativa;
	}
	
	
}
