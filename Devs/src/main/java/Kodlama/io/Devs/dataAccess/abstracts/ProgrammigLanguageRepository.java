package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;


import Kodlama.io.Devs.entities.concretes.ProgrammigLanguage;


public interface ProgrammigLanguageRepository {
	
	List<ProgrammigLanguage>  getAll();
	List<ProgrammigLanguage>  add(ProgrammigLanguage newLanguage);
	List<ProgrammigLanguage>  delete(int id);
	List<ProgrammigLanguage>  update(ProgrammigLanguage newLanguage);
	ProgrammigLanguage  getId(ProgrammigLanguage newLanguage);
	

}
