package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;


public class LanguageManager implements LanguageService{

	private LanguageRepository languageRepository;
	private Language language;
	
	
	
	public LanguageManager(LanguageRepository languageRepository, Language language) {
		this.languageRepository = languageRepository;
		this.language = language;
	}

	@Override
	public List<Language> getall() {
		
		return languageRepository.getall();
	}

	@Override
	public List<Language> update() throws Exception {
		if(language.getName().equals(language.getName()) && language.getName().length()==0){
			throw new Exception
			("Programming language name cannot be the same and can't be passed.");
		}
		return languageRepository.update();
	}

	@Override
	public List<Language> add() throws Exception {
		if(language.getName().equals(language.getName()) && language.getName().length()==0){
			throw new Exception
			("Programming language name cannot be the same and can't be passed.");
		}
		return languageRepository.add();
	}

	@Override
	public List<Language> delete() throws Exception {
		if(language.getName().equals(language.getName()) && language.getName().length()==0){
			throw new Exception
			("Programming language name cannot be the same and can't be passed.");
		}
		
		return languageRepository.delete();
	}

	
	

	

}
