
public class Retangulo {
	Medida base, altura;
	
	Retangulo(Medida base, Medida altura){
		this.base = base;
		this.altura = altura;
	}
	
	int CalcularArea(){
		int area = base.getMedida() * altura.getMedida();
		return area;
	}
}
