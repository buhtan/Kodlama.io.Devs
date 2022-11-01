package Kodlama.io.Devs.entities.concretes;

public class ProgrammigLanguage {

	
	private int id;
	private String Language;
	
	public ProgrammigLanguage() {
		super();
	}

	public ProgrammigLanguage(int id, String language) {
		super();
		this.id = id;
		Language = language;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}
	
	
	
}
