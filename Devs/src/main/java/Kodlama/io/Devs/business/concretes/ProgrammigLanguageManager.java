package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.ProgrammigLanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammigLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammigLanguage;

@Service // bu sınıf bir business nesnesidir
public class ProgrammigLanguageManager implements ProgrammigLanguageService {

	private ProgrammigLanguageRepository languageRepository;
	
	@Autowired
	public ProgrammigLanguageManager(ProgrammigLanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}


	@Override
	public List<ProgrammigLanguage> getAll() {
		// iş kuralları
		return languageRepository.getAll();
	}


	@Override
	public List<ProgrammigLanguage> add(ProgrammigLanguage newLanguage) {
		for (ProgrammigLanguage languages: this.languageRepository.getAll()) {
			if(languages.getLanguage() == newLanguage.getLanguage()) {
				return languageRepository.getAll();
			}
			
		}
		if(newLanguage.getLanguage() != null && newLanguage.getLanguage() !="") {
			return languageRepository.add(newLanguage);
		}
		
		return languageRepository.getAll();
		
	}


	@Override
	public List<ProgrammigLanguage> delete(int id) {
		return languageRepository.delete(id);
	}


	@Override
	public List<ProgrammigLanguage> update(ProgrammigLanguage newLanguage) {
		return languageRepository.update(newLanguage);
	}


	@Override
	public ProgrammigLanguage getId(ProgrammigLanguage newLanguage) {
		return languageRepository.getId(newLanguage);
	}

}
