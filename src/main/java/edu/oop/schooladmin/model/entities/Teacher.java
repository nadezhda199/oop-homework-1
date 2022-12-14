package edu.oop.schooladmin.model.entities;

import java.time.LocalDate;

public class Teacher {
	private int teacherId;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private int rank;

	public Teacher(int teacherId, String firstName, String lastName, LocalDate birthDate, int rank) {
		this.teacherId = teacherId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.rank = rank;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
}
