package edu.oop.schooladmin.model.interfaces;

import java.util.ArrayList;
import java.util.List;

import edu.oop.schooladmin.model.entities.Student;

public interface StudentsRepository {
    boolean addStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentByStudentId(Integer studentId);

    List<Student> getStudentsByStudentSecondName(String secondName);

    List<Student> getStudentsByGroupId(int GroupId);

    boolean removeStudent(Integer studentId);

    boolean updateStudentData(Student student);
}
