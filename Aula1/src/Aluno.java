
public class Aluno {
	private String nome, 
				   curso;
	private int mat;
	
	public void status(){
		System.out.println(this.nome);
		System.out.println(this.curso);
		System.out.println(this.mat);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
			
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	
}
