package edu.oop.schooladmin.model.interfaces;

import edu.oop.schooladmin.model.entities.Discipline;

public interface DisciplinesRepository {
	
	Discipline getDiscipline(int disciplineId);
}
