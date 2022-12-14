package edu.oop.schooladmin.model.entities;

import java.time.LocalDateTime;

public class Rating {
	private int ratingId;
	private int studentId;
	private int disciplineId;
	private LocalDateTime dateTime;
	private int value;
	private String commentary;

	public Rating(int ratingId, int studentId, int disciplineId, LocalDateTime dateTime, int value, String commentary) {
		this.ratingId = ratingId;
		this.studentId = studentId;
		this.disciplineId = disciplineId;
		this.dateTime = dateTime;
		this.value = value;
		this.commentary = commentary;
	}

	public int getRatingId() {
		return ratingId;
	}

	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getDisciplineId() {
		return disciplineId;
	}

	public void setDisciplineId(int disciplineId) {
		this.disciplineId = disciplineId;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getCommentary() {
		return commentary;
	}

	public void setCommentary(String commentary) {
		this.commentary = commentary;
	}
}
