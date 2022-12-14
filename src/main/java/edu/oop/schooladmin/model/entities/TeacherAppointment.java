package edu.oop.schooladmin.model.entities;

public class TeacherAppointment {
	private int appointmentId;
	private int teacherId;
	private int disciplineId;
	private int groupId;

	public TeacherAppointment(int appointmentId, int teacherId, int disciplineId, int groupId) {
		this.appointmentId = appointmentId;
		this.teacherId = teacherId;
		this.disciplineId = disciplineId;
		this.groupId = groupId;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public int getDisciplineId() {
		return disciplineId;
	}

	public void setDisciplineId(int disciplineId) {
		this.disciplineId = disciplineId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
}
