package br.com.vovolinux.matriculas.entidade;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Turma {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;

	@OneToMany
	@JoinColumn(name="turma_id")
	private List<Disciplina> disciplinas= new ArrayList<>();
	
	
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
