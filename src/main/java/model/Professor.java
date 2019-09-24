package model;

import javax.persistence.Entity;

@Entity
public class Professor extends User {
	private String matricula;
	private String cursoAtuante;
	private String especialidades;

	public Professor(String name, String cpf, String matricula, String cursoAtuante, String especialidades) {
		super(name, cpf);
		this.matricula = matricula;
		this.cursoAtuante = cursoAtuante;
		this.especialidades = especialidades;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCursoAtuante() {
		return cursoAtuante;
	}

	public void setCursoAtuante(String cursoAtuante) {
		this.cursoAtuante = cursoAtuante;
	}

	public String getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(String especialidades) {
		this.especialidades = especialidades;
	}
	

}
