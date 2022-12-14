package edu.oop.schooladmin.model.interfaces;

import edu.oop.schooladmin.model.entities.Discipline;

public interface DisciplinesRepository {

	Discipline getDiscipline(int disciplineId);
	Discipline getDiscipline(String disciplineName);

	Discipline addDiscipline(Discipline discipline);

	Discipline setDiscipline(Discipline discipline);
}
