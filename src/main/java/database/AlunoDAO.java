package database;

import java.util.List;

import javax.persistence.EntityManager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Aluno;

public class AlunoDAO implements InterfaceDAO<Aluno> {
	private static ObservableList<Aluno> alunos;

	@Override
	public Aluno get(String id) {
		if (alunos != null)
			for (Aluno aluno : alunos)
				if (aluno.getCpf().contentEquals(id))
					return aluno;

		EntityManager entityMng = Conection.getEntityManager();
		Aluno aluno = entityMng.find(Aluno.class, id);
		entityMng.close();
		return aluno;
	}

	@Override
	public List<Aluno> getAll() {
		if (alunos == null) {
			EntityManager entityMng = Conection.getEntityManager();
			alunos = FXCollections.observableArrayList(
					entityMng.createQuery("select user from User as user", Aluno.class).getResultList());
			entityMng.close();
		}
		return alunos;
	}

	@Override
	public void add(Aluno aluno) {
		EntityManager entityMng = Conection.getEntityManager();
		entityMng.getTransaction().begin();
		entityMng.persist(aluno);
		entityMng.getTransaction().commit(); // sempre que iniciamos uma transação, precisamos dar o commit
		entityMng.close();

		// adiciono na lista de usuários que está na memória, se todos os usuários já
		// foram carregador do banco
		if (alunos != null)
			alunos.add(aluno);
	}

	@Override
	public void delete(Aluno obj) {
		EntityManager entityMng = Conection.getEntityManager();
		entityMng.getTransaction().begin();
		Aluno userDB = entityMng.find(Aluno.class, obj.getCpf());
		entityMng.remove(userDB);
		entityMng.getTransaction().commit();
		entityMng.close();

		Aluno found = null;
		if (alunos != null)
			for (Aluno aluno : alunos)
				if (aluno.getCpf().contentEquals(obj.getCpf()))
					found = aluno;
		if(found != null)
			alunos.remove(found);
	}

	@Override
	public void update(Aluno obj) {
		EntityManager entityMng = Conection.getEntityManager();
		entityMng.getTransaction().begin();
		Aluno userDB = entityMng.find(Aluno.class, obj.getCpf());
		userDB.setCpf(obj.getCpf());
		entityMng.getTransaction().commit();
		entityMng.close();

		if (alunos != null) {
			for (Aluno aluno : alunos) {
				if (aluno.getCpf().contentEquals(obj.getCpf())) {
					aluno.setCpf(obj.getCpf());
					
				}
			}
		}

	}
}
