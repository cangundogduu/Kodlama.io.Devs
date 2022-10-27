package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	
	List<Language> getall();
	List<Language> update() throws Exception;
	List<Language> add() throws Exception;
	List<Language> delete() throws Exception;
	
	
}
