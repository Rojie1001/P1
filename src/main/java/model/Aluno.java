package model;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity(name = "Aluno")
public class Aluno {


	
	@Id
	private String cpf;
	private String nome;
	
	private String curso;
	private String login;
	private String senha;

	public Aluno() {

	}

	public Aluno(String cpf,String nome, String curso, String login, String senha) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.curso = curso;
		this.login = login;
		this.senha = senha;
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
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



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return cpf + nome + curso + login + senha;
	}
	


}
