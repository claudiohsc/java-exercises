
public class Medida {

	int valor;
	String unidade;
	
	public Medida(int valor, String unidade) {
		this.valor = valor;
		this.unidade = unidade;
		
	}
	int getMedida() {
		if (unidade.equals("cm"))
			return valor * 10;
		else
			return valor;
	}	
	
	
}
