package edu.oop.schooladmin.model.implementations.testdb;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import edu.oop.schooladmin.model.entities.Discipline;
import edu.oop.schooladmin.model.interfaces.DisciplinesRepository;
import edu.oop.schooladmin.testdatatables.DisciplinesTable;

public class TestDbDisciplinesRepository implements DisciplinesRepository {

	private static final ArrayList<Discipline> disciplines = DisciplinesTable.disciplines();

	@Override
	public Discipline getDiscipline(int disciplineId) {
		return null;
	}
	
}
