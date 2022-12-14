package edu.oop.schooladmin.model.implementations.testdb;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import edu.oop.schooladmin.model.entities.Discipline;
import edu.oop.schooladmin.model.interfaces.DisciplinesRepository;
import edu.oop.schooladmin.testdatatables.DisciplinesTable;

public class TestDbDisciplinesRepository implements DisciplinesRepository {

	private final ArrayList<Discipline> disciplines;
	private int lastId;

	private TestDbDisciplinesRepository() {
		disciplines = DisciplinesTable.disciplines();
		if (disciplines.size() > 0) {
			lastId = disciplines.stream().mapToInt(d -> Integer.valueOf(d.getDisciplineId())).max().getAsInt();
		} else {
			lastId = -1;
		}
	}

	@Override
	public Discipline getDiscipline(int disciplineId) {
		var dbEntity = disciplines.stream().filter(d -> d.getDisciplineId() == disciplineId).findFirst();
		if (dbEntity.isPresent()) {
			return new Discipline(dbEntity.get());
		}
		return null;
	}

	@Override
	public Discipline getDiscipline(String disciplineName) {
		var dbEntity = disciplines.stream().filter(d -> disciplineName.equalsIgnoreCase(d.getName())).findFirst();
		if (dbEntity.isPresent()) {
			return new Discipline(dbEntity.get());
		}
		return null;
	}

	@Override
	public Discipline addDiscipline(Discipline discipline) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Discipline setDiscipline(Discipline discipline) {
		// TODO Auto-generated method stub
		return null;
	}

	public static class TestTestDbDisciplinesRepository {
		public static void main(String[] args) {
			var disciplinesRepository = new TestDbDisciplinesRepository();
			System.out.println(disciplinesRepository.lastId);
			System.out.println(disciplinesRepository.getDiscipline(null));
		}
	}
}
