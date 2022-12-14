package edu.oop.schooladmin.model.interfaces;

import java.util.ArrayList;
import java.util.List;

import edu.oop.schooladmin.model.entities.Teacher;

public interface TeachersRepository {
    boolean addTeacher(Teacher teacher);

    List<Teacher> getAllTeachers();

    Teacher getTeacherByTeacherId(Integer teacherId);

    List<Teacher> getTeachersByTeacherSecondName(String secondName);

    List<Teacher> getTeachersByGrade(int grade);

    boolean removeTeacher(Integer teacherId);

    boolean updateTeacherData(Teacher teacher);
}
