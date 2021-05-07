package entites;


import java.util.ArrayList;
import java.util.List;

public class Planos extends Cadastro {

	protected String plano;
	protected List<Cadastro> listAtivos = new ArrayList<>();
	protected List<Cadastro> listNaoAtivos = new ArrayList<>();
	public Planos() {
		
	}
	public Planos(String nome, Long cpf, float peso, float altura, String status, String plano) {
		super(nome, cpf, peso, altura, status);
		this.plano = plano;
	}
	public String getPlano() {
		return plano;
	}
	public void setPlano(String plano) {
		this.plano = plano;
	}
	public List<Cadastro> getListAtivos() {
		return listAtivos;
	}
	
	public List<Cadastro> getListNaoAtivos() {
		return listNaoAtivos;
	}
	
	@Override
	public String toString() {
	return "** Dados do aluno cadastrado ** : " + "\n" 
	+"Nome: " + nome + "\n" 
	+"CPF: "  + cpf + "\n"
	+ "Peso: " + String.format("%.2f", peso) + " kg" + "\n"
	+ "Altura: " + String.format("%.2f", altura) + " m" + "\n"
	+ "Plano: " + plano + "\n" + "------------------";
	
				
	}
	


	
	
}

