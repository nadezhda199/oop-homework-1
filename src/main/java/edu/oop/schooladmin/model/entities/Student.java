package edu.oop.schooladmin.model.entities;

import java.time.LocalDate;

public class Student extends Person{
    private Integer studentId;
    private int groupId;
	public int grade;

    public Student(Integer studentId, String firstName, String secondName, LocalDate birthDate, int groupId) {
        super(firstName, secondName, birthDate);
        this.studentId = studentId;
        this.groupId = groupId;
    }

	public Student(Student other) {
		this(other.studentId, other.firstName, other.secondName, other.birthDate, other.groupId);
	}
	
	public Student(String firstName, String secondName, LocalDate birthDate, int groupId) {
		this(null, firstName, secondName, birthDate, groupId);
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

    public Integer getStudentId() {
        return studentId;
    }

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

    public int getGroupId() {
        return groupId;
    }

    @Override
    public String toString() {
        return studentId + ":" + super.toString() + ":" + groupId;
    }
	
}
