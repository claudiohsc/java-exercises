
public class Calculadora {
	
	private int op1, op2, resultado;
	
	Calculadora(){
		
	}
	
	Calculadora(int o1, int o2){
		this.op1 = o1;
		this.op2 = o2;
	}
	
	public int somar() {
		this.resultado = (this.op1 + this.op2);
		return this.resultado;
	}
	
	public int subtracao() {
		this.resultado = (this.op1 - this.op2);
		return this.resultado;
	}
	
	public void setOp1(int o1) {
		this.op1 = o1;
	}
	
	public void setOp2(int o2) {
		this.op2 = o2;
	}
	
	public int getOp1() {
		return this.op1;
	}
	
	public int getOp2() {
		return this.op2;
	}
	
	public int getResultado() {
		return this.resultado;
	}
}
