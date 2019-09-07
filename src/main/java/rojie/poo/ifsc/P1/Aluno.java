package rojie.poo.ifsc.P1;

public class Aluno {

	private int matricula;
	private String nome;
	private String login;
	private String senha;
	
	public Aluno(int matricula, String nome, String login, String senha) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
