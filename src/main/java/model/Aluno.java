package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno{
	
	
	@Id 
	private String matricula;
	private String curso;
	private String cpf;
	private String name;
	
	public Aluno() {
		
	}

	public Aluno(String matricula, String curso, String cpf, String name) {
		super();
		this.matricula = matricula;
		this.curso = curso;
		this.cpf = cpf;
		this.name = name;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
	

