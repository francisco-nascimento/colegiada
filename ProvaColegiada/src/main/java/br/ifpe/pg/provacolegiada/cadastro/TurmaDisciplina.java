package br.ifpe.pg.provacolegiada.cadastro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TurmaDisciplina {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	private Turma turma;
	@ManyToOne
	private Disciplina disciplina;
	@ManyToOne
	private Professor professor;
	private int ano;
	private int entrada;
	
	public TurmaDisciplina() {
		super();
	}
	public TurmaDisciplina(Integer id, Turma turma, Disciplina disciplina, Professor professor, int ano, int entrada) {
		super();
		this.id = id;
		this.turma = turma;
		this.disciplina = disciplina;
		this.professor = professor;
		this.ano = ano;
		this.entrada = entrada;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getEntrada() {
		return entrada;
	}
	public void setEntrada(int entrada) {
		this.entrada = entrada;
	}
	

}
