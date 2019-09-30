package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Professor{
	@Id
	private String cpf;
	
	private String name;
	private String cursoAtuante;
	private String especialidades;
	
	public Professor() {
		
	}
	
	public Professor(String cpf, String name, String cursoAtuante, String especialidades) {
		super();
		this.cpf = cpf;
		this.name = name;
		this.cursoAtuante = cursoAtuante;
		this.especialidades = especialidades;
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