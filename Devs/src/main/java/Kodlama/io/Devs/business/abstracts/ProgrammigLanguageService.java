package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.ProgrammigLanguage;

public interface ProgrammigLanguageService {
	List<ProgrammigLanguage> getAll();
	
	List<ProgrammigLanguage>  add(ProgrammigLanguage newLanguage);
	List<ProgrammigLanguage>  delete(int id);
	List<ProgrammigLanguage>  update(ProgrammigLanguage newLanguage);
	ProgrammigLanguage  getId(ProgrammigLanguage newLanguage);
	

}
