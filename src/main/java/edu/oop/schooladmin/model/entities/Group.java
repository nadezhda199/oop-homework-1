package edu.oop.schooladmin.model.entities;

public class Group {
	private int groupId;
	private int classYear;
	private char classMark;
	private Integer teacherId;

	public Group(int groupId, int classYear, char classMark, Integer teacherId) {
		this.groupId = groupId;
		this.classYear = classYear;
		this.classMark = classMark;
		this.teacherId = teacherId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getClassYear() {
		return classYear;
	}

	public void setClassYear(int classYear) {
		this.classYear = classYear;
	}

	public char getClassMark() {
		return classMark;
	}

	public void setClassMark(char classMark) {
		this.classMark = classMark;
	}

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}
}
