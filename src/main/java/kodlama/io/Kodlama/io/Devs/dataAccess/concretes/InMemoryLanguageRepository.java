package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public class InMemoryLanguageRepository implements LanguageRepository{

	private List<Language> languages;
	
	
	
	public InMemoryLanguageRepository() {
		languages= new ArrayList<Language>();
		languages.add(new Language(1,"C#"));
		languages.add(new Language(2,"Java"));
		languages.add(new Language(3,"Python"));
	}

	@Override
	public List<Language> getall() {
		
		return languages;
	}

	@Override
	public List<Language> delete() {
		
		return languages;
	}

	@Override
	public List<Language> add() {
		
		return languages;
	}

	@Override
	public List<Language> update() {
		
		return languages;
	}

}
