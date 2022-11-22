package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.business.requests.languages.AddLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.languages.DeleteLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.languages.UpdateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.LanguageResponse;
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
	public List<LanguageResponse> getall() {
		List<Language>languages= languageRepository.findAll();
		List<LanguageResponse> languageResponses= new ArrayList<LanguageResponse>();
		
		for (Language language : languages) {
			LanguageResponse languageResponse= new LanguageResponse();
			languageResponse.setId(language.getId());
			languageResponse.setName(language.getName());
			languageResponses.add(languageResponse);
			
		}
				
		return languageResponses;
	}



	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest) throws Exception {
		
		updateLanguageRequest.setId(language.getId());
		updateLanguageRequest.setName(language.getName());
		
		if(language.getName()==null||updateLanguageRequest.getName().isEmpty()) {
			
			throw new Exception ("this area cannot be blank");
		}
		
		else {
			languageRepository.save(language);
			throw new Exception("language information is updated.");	
		}
		
		
	}



	@Override
	public void add(AddLanguageRequest addLanguageRequest) throws Exception {
		
		
		addLanguageRequest.setId(language.getId());
		addLanguageRequest.setName(language.getName());
		
		if(language.getName()==null||addLanguageRequest.getName().isEmpty()) {
			
			throw new Exception ("this area cannot be blank");
		}
		
		else {
			languageRepository.save(language);
			throw new Exception("language information is added.");	
		}
		
		
		
		
	}



	@Override
	public void delete(DeleteLanguageRequest deleteLanguageRequest) throws Exception {
		
		deleteLanguageRequest.setId(language.getId());
		deleteLanguageRequest.setName(language.getName());
		if(language.getName()==null||deleteLanguageRequest.getName().isEmpty()) {
			throw new Exception("this area cannot be blank");
		}
		else {
			languageRepository.deleteAll();
			throw new Exception("language information is delected.");
		}
		
		
	}

	

	
	

	

}
