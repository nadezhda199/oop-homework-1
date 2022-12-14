package edu.oop.schooladmin.model.implementations.testdb;

import edu.oop.schooladmin.model.interfaces.DataProvider;
import edu.oop.schooladmin.model.interfaces.DisciplinesRepository;
import edu.oop.schooladmin.model.interfaces.GroupsRepository;
import edu.oop.schooladmin.model.interfaces.RatingsRepository;
import edu.oop.schooladmin.model.interfaces.StudentsRepository;
import edu.oop.schooladmin.model.interfaces.TeacherAppointmentsRepository;
import edu.oop.schooladmin.model.interfaces.TeachersRepository;
import edu.oop.schooladmin.model.interfaces.UserRolesRepository;
import edu.oop.schooladmin.model.interfaces.UsersRepository;

public class TestDbProvider implements DataProvider {

	private DisciplinesRepository disciplinesRepository;
	private TeachersRepository teachersRepository;
	private GroupsRepository groupsRepository;
	private StudentsRepository studentsRepository;
	private TeacherAppointmentsRepository teacherAppointmentsRepository;
	private RatingsRepository ratingsRepository;

	public TestDbProvider(DisciplinesRepository disciplinesRepository, TeachersRepository teachersRepository,
			GroupsRepository groupsRepository, StudentsRepository studentsRepository,
			TeacherAppointmentsRepository teacherAppointmentsRepository, RatingsRepository ratingsRepository) {
		this.disciplinesRepository = disciplinesRepository;
		this.teachersRepository = teachersRepository;
		this.groupsRepository = groupsRepository;
		this.studentsRepository = studentsRepository;
		this.teacherAppointmentsRepository = teacherAppointmentsRepository;
		this.ratingsRepository = ratingsRepository;
	}

	@Override
	public DisciplinesRepository disciplinesRepository() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeachersRepository teachersRepository() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GroupsRepository groupsRepository() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentsRepository studentsRepository() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeacherAppointmentsRepository teacherAppointmentsRepository() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RatingsRepository ratingsRepository() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsersRepository usersRepository() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRolesRepository userRolesRepository() {
		// TODO Auto-generated method stub
		return null;
	}

}
