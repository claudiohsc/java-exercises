package aula4;

public class Retangulo {
	Medida base, altura;
	
	Retangulo(Medida base, Medida altura){
		this.base = base;
		this.altura = altura;
	}
	
	int CalcularArea(){
		int valor = base.getMedida() * altura.getMedida();
		String unidade = base.getUnidade();
		unidade += " 2";
		Medida area = new Medida(valor, unidade);
		return area.getMedida();
	}
}
