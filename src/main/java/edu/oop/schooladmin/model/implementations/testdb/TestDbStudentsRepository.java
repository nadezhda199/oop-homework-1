package edu.oop.schooladmin.model.implementations.testdb;

import java.util.ArrayList;
import java.util.List;

import edu.oop.schooladmin.model.entities.Student;
import edu.oop.schooladmin.model.interfaces.StudentsRepository;
import edu.oop.schooladmin.testdatatables.StudentsTable;

public class TestDbStudentsRepository implements StudentsRepository {

    private static final ArrayList<Student> students = StudentsTable.students();
    private static int currentId = getMaxId();

    @Override
    public boolean addStudent(Student student) {
        if (student.getStudentId() == null){
            student.setStudentId(++currentId);
            return students.add(student);
        }
        return false;
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> resultList = new ArrayList<>();
        for (Student student : students) {
            resultList.add(new Student(student));
        }
        return resultList;
    }

    @Override
    public Student getStudentByStudentId(Integer studentId) {
        var dbEntity = students.stream().filter(s -> s.getStudentId().equals(studentId)).findFirst();
        if (dbEntity.isPresent()){
            return new Student(dbEntity.get());
        }
        return null;
    }

    @Override
    public List<Student> getStudentsByStudentSecondName(String secondName) {
        List<Student> resultList = new ArrayList<>();
        for (Student student : students) {
            if (student.getSecondName().equalsIgnoreCase(secondName)){
                resultList.add(new Student(student));
            }
        }
        return resultList;
    }

    @Override
    public List<Student> getStudentsByGroupId(int groupId) {
        List<Student> resultList = new ArrayList<>();
        for (Student student : students) {
            if (student.getGroupId() == groupId){
                resultList.add(new Student(student));
            }
        }
        return resultList;
    }

    @Override
    public boolean removeStudent(Integer studentId) {
        Integer index = null;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getStudentId().equals(studentId)){
                index = i;
                break;
            }            
        }
        if (index != null){
            students.remove(index.intValue());
            return true;
        }
        else return false;
    }

    @Override
    public boolean updateStudentData(Student student) {
        Integer index = null;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getStudentId().equals(student.getStudentId())){
                index = i;
                break;
            }            
        }
        if (index != null){
            students.set(index.intValue(), student);
            return true;
        }
        else return false;
    }

    public static int getMaxId(){
        int max = 0;
        for (Student student : students) {
            if (student.getStudentId() >= max) max = student.getStudentId();
        }
        return max;
    }
    
}
