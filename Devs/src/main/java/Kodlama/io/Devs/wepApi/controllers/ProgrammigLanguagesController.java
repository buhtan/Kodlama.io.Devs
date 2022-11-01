package Kodlama.io.Devs.wepApi.controllers;
import Kodlama.io.Devs.entities.concretes.ProgrammigLanguage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.ProgrammigLanguageService;
import Kodlama.io.Devs.entities.concretes.ProgrammigLanguage;

@RestController
@RequestMapping("/api/programmigLanguages")
public class ProgrammigLanguagesController {
	private ProgrammigLanguageService languageService;
	
   @Autowired
	public ProgrammigLanguagesController(ProgrammigLanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	@GetMapping("/getAll")
	public List<ProgrammigLanguage> getAll(){
		return languageService.getAll();
		
	}
	@GetMapping("/add")
	public List<ProgrammigLanguage> add(){
		return languageService.add(new ProgrammigLanguage(4,"dart"));
		
	}
	
	@GetMapping("/delete")
	public List<ProgrammigLanguage> delete(){
		return languageService.delete(1);
		
	}
	@GetMapping("/update")
	public List<ProgrammigLanguage> uptade(){
		return languageService.update(new ProgrammigLanguage(1,"update deneme"));
		
	}
	@GetMapping("/getId")
	public ProgrammigLanguage getId(){
		return languageService.getId(new ProgrammigLanguage(1,"update deneme"));
		
	}
	
	

	

}
