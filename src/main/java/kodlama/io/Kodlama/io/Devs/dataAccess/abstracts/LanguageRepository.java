package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	
	List<Language> getall();
	List<Language> delete();
	List<Language> add();
	List<Language> update();
}
