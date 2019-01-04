package br.ifpe.pg.provacolegiada.cadastro;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Turma {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String sigla;
	@ManyToOne
	private Curso curso;
	@Enumerated(EnumType.STRING)
	private Turno turno;
	public Turma() {
		super();
	}
	public Turma(Integer id, String sigla, Curso curso, Turno turno) {
		super();
		this.id = id;
		this.sigla = sigla;
		this.curso = curso;
		this.turno = turno;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Turno getTurno() {
		return turno;
	}
	public void setTurno(Turno turno) {
		this.turno = turno;
	}
	
	
}
