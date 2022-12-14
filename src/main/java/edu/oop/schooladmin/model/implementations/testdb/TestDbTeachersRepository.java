package edu.oop.schooladmin.model.implementations.testdb;

import java.util.ArrayList;
import java.util.List;

import edu.oop.schooladmin.model.entities.Teacher;
import edu.oop.schooladmin.model.interfaces.TeachersRepository;
import edu.oop.schooladmin.testdatatables.TeachersTable;

public class TestDbTeachersRepository implements TeachersRepository{

    private static final ArrayList<Teacher> teachers = TeachersTable.getTeachers();
    private static int currentId = getMaxId();

    @Override
    public boolean addTeacher(Teacher teacher) {
        if (teacher.getTeacherId() == null){
            teacher.setTeacherId(++currentId);
            return teachers.add(teacher);
        }
        return false;
    }

    @Override
    public List<Teacher> getAllTeachers() {
        List<Teacher> resultList = new ArrayList<>();
        for (Teacher teacher : teachers) {
            resultList.add(new Teacher(teacher));
        }
        return resultList;
    }

    @Override
    public Teacher getTeacherByTeacherId(Integer teacherId) {
        var dbEntity = teachers.stream().filter(s -> s.getTeacherId().equals(teacherId)).findFirst();
        if (dbEntity.isPresent()){
            return new Teacher(dbEntity.get());
        }
        return null;
    }

    @Override
    public List<Teacher> getTeachersByTeacherSecondName(String secondName) {
        List<Teacher> resultList = new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (teacher.getSecondName().equalsIgnoreCase(secondName)){
                resultList.add(new Teacher(teacher));
            }
        }
        return resultList;
    }

    @Override
    public List<Teacher> getTeachersByGrade(int grade) {
        List<Teacher> resultList = new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (teacher.getGrade() == grade){
                resultList.add(new Teacher(teacher));
            }
        }
        return resultList;
    }

    @Override
    public boolean removeTeacher(Integer teacherId) {
        Integer index = null;
        for (int i = 0; i < teachers.size(); i++) {
            if(teachers.get(i).getTeacherId().equals(teacherId)){
                index = i;
                break;
            }            
        }
        if (index != null){
            teachers.remove(index.intValue());
            return true;
        }
        else return false;
    }

    @Override
    public boolean updateTeacherData(Teacher teacher) {
        Integer index = null;
        for (int i = 0; i < teachers.size(); i++) {
            if(teachers.get(i).getTeacherId().equals(teacher.getTeacherId())){
                index = i;
                break;
            }            
        }
        if (index != null){
            teachers.set(index.intValue(), teacher);
            return true;
        }
        else return false;
    }

    public static int getMaxId(){
        int max = 0;
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() >= max) max = teacher.getTeacherId();
        }
        return max;
    }
    
}
