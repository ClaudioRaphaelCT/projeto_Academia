package entites;

public class Cadastro {
	protected String nome;
	protected Long cpf;
	protected float peso;
	protected float altura;
	protected String status;

	public Cadastro() {

	}

	public Cadastro(String nome, Long cpf, float peso, float altura, String status) {

		this.nome = nome;
		this.cpf = cpf;
		this.peso = peso;
		this.altura = altura;
		this.status = status;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String isStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	}




