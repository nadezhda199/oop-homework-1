package edu.oop.schooladmin.model.entities;

public class Discipline {
	private Integer disciplineId;
	private String name;

	public Discipline(Integer disciplineId, String name) {
		this.disciplineId = disciplineId;
		this.name = name;
	}

	public Discipline(Discipline other) {
		this(other.disciplineId, other.name);
	}

	public Integer getDisciplineId() {
		return disciplineId;
	}

	public void setDisciplineId(Integer disciplineId) {
		this.disciplineId = disciplineId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
