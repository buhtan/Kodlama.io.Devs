package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.ProgrammigLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammigLanguage;

@Repository // bu sınıf bir dataAcces nesnesidir
public class InMemoryProgrammigLanguageRepository implements ProgrammigLanguageRepository{

	
	List<ProgrammigLanguage> ProgrammigLanguages;
	
	
	public InMemoryProgrammigLanguageRepository() {
		ProgrammigLanguages = new ArrayList<ProgrammigLanguage>();
		ProgrammigLanguages.add(new ProgrammigLanguage(1,"Java"));
		ProgrammigLanguages.add(new ProgrammigLanguage(2,"C#"));
		ProgrammigLanguages.add(new ProgrammigLanguage(3,"Python"));
	}


	@Override
	public List<ProgrammigLanguage> getAll() {
		
		return ProgrammigLanguages;
	}


	@Override
	public List<ProgrammigLanguage> add(ProgrammigLanguage newLanguage) {
		ProgrammigLanguages.add(newLanguage);
		return ProgrammigLanguages;
	}


	@Override
	public List<ProgrammigLanguage> delete(int id) {
		ProgrammigLanguages.remove(1);
		return ProgrammigLanguages;
	}

	@Override
	public List<ProgrammigLanguage> update(ProgrammigLanguage newLanguage) {
		ProgrammigLanguages.set(newLanguage.getId()-1,newLanguage);
		return ProgrammigLanguages;
	}


	@Override
	public ProgrammigLanguage getId(ProgrammigLanguage newLanguage) {
		return ProgrammigLanguages.get(newLanguage.getId()-1);
		
	}
	

}
