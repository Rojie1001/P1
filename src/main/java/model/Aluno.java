package model;

import javax.persistence.Entity;

@Entity
public class Aluno extends User{
	private String curso;
	private String matricula;
	
	public Aluno(String name, String cpf, String curso, String matricula) {
		super(name, cpf);
		this.curso = curso;
		this.matricula = matricula;	
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
}

