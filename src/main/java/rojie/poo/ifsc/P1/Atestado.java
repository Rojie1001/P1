package rojie.poo.ifsc.P1;

public class Atestado {

	private String Codigo;
	private String Comp;
	private String Turma;
	private String Status;
	private String Horario;
	
	public Atestado(String codigo, String comp, String turma, String status, String horario) {
		super();
		this.Codigo = codigo;
		Comp = comp;
		Turma = turma;
		Status = status;
		Horario = horario;
	}

	private String getCodigo() {
		return Codigo;
	}

	private void setCodigo(String codigo) {
		this.Codigo = codigo;
	}

	private String getComp() {
		return Comp;
	}

	private void setComp(String comp) {
		Comp = comp;
	}

	private String getTurma() {
		return Turma;
	}

	private void setTurma(String turma) {
		Turma = turma;
	}

	private String getStatus() {
		return Status;
	}

	private void setStatus(String status) {
		Status = status;
	}

	private String getHorario() {
		return Horario;
	}

	private void setHorario(String horario) {
		Horario = horario;
	}
	

	
	
	

}
